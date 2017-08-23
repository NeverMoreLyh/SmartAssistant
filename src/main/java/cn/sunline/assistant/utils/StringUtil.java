package cn.sunline.assistant.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author jxb
 *
 */
public class StringUtil extends StringUtil_ {
	private static final char[] CHAR = new char[10 + ('Z' - 'A' + 1) + ('z' - 'a' + 1)];
	static {
		int index = 0;
		for (int i = '0'; i <= '9'; i++) CHAR[index++] = (char) i;
		for (int i = 'A'; i <= 'Z'; i++) CHAR[index++] = (char) i;
		for (int i = 'a'; i <= 'z'; i++) CHAR[index++] = (char) i;
	}
	
	public static String random(int expectLen, boolean number) {
		char[] ch = new char[expectLen];
		for (int i = 0; i < expectLen; i++) {
			ch[i] = CHAR[((int) (Math.random() * (number ? 10 : CHAR.length)))];
		}
		return new String(ch);
	}

	public static String getStackTrace(Throwable t) {
		StringWriter w = new StringWriter();
		PrintWriter s = new PrintWriter(w);
		t.printStackTrace(s);
		return w.toString();
	}
	
	public static String capitalFirst(String s) {
		return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
	}
	
	public static String uncapitalFirst(String s) {
		return String.valueOf(s.charAt(0)).toLowerCase() + s.substring(1);
	}
	/**
	 * 得到类似str1,str2,str3的值
	 * @param limit
	 * @param args
	 * @return
	 */
	public static String join(String limit, String ... args) {
		if (args == null) return "";
		return join(limit, Arrays.asList(args));
	}
	/**
	 * 得到类似str1,str2,str3的值
	 * @param limit
	 * @param args
	 * @return
	 */
	public static String join(String limit, List<String> args) {
		if (args == null || args.size() == 0) return "";
		if (args.size() == 1) return args.get(0);
		
		StringBuffer ret = new StringBuffer();
		ret.append(args.get(0));
		for (int i = 1; i < args.size(); i++)
			ret.append(limit).append(args.get(i));
		return ret.toString();
	}

	/**
	 * Check that the given String is neither <code>null</code> nor of length 0.
	 * Note: Will return <code>true</code> for a String that purely consists of whitespace.
	 * <p><pre>
	 * StringUtils.hasLength(null) = false
	 * StringUtils.hasLength("") = false
	 * StringUtils.hasLength(" ") = true
	 * StringUtils.hasLength("Hello") = true
	 * </pre>
	 * @param str the String to check (may be <code>null</code>)
	 * @return <code>true</code> if the String is not null and has length
	 * @see #hasText(String)
	 * 
	 * @see org.springframework.util.StringUtils#hasLength
	 */
	public static boolean hasLength(String str) {
		return (str != null && str.length() > 0);
	}

	/**
	 * Check whether the given String has actual text.
	 * More specifically, returns <code>true</code> if the string not <code>null</code>,
	 * its length is greater than 0, and it contains at least one non-whitespace character.
	 * <p><pre>
	 * StringUtils.hasText(null) = false
	 * StringUtils.hasText("") = false
	 * StringUtils.hasText(" ") = false
	 * StringUtils.hasText("12345") = true
	 * StringUtils.hasText(" 12345 ") = true
	 * </pre>
	 * @param str the String to check (may be <code>null</code>)
	 * @return <code>true</code> if the String is not <code>null</code>, its length is
	 * greater than 0, and it does not contain whitespace only
	 * @see java.lang.Character#isWhitespace
	 * 
	 * @see org.springframework.util.StringUtils#hasLength
	 */
	public static boolean hasText(String str) {
		if (!hasLength(str)) {
			return false;
		}
		int strLen = str.length();
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private static final ThreadLocal<List<Object>> cache = new ThreadLocal<List<Object>>();
	// 递归调用TOSTRING对象的数量：用于控制递归调用总量
	private static final ThreadLocal<Integer> cacheCount = new ThreadLocal<Integer>();
	
	public static <K, V> String mapToString(Map<K, V> map) {
		return mapToString(map, null);
	}
	
	/**
	 * @see java.util.AbstractMap#toString
	 */
	public static <K, V> String mapToString(Map<K, V> map, Map<K, V> parent) {
		List<Object> list = cache.get();
		if (list == null) cache.set(list = new ArrayList<Object>());
		if (list.size() == 0) cacheCount.set(0);
		if (contains(list, map)) return "[^" + map.hashCode() + "]";
		if (cacheCount.get() != null && cacheCount.get() > 50) 
			return "<TOO MANY OBJECTS:" + cacheCount.get() + ">";
		
		list.add(map);
		cacheCount.set(cacheCount.get() == null ? 1 : cacheCount.get() + 1);
		try {
			return toString(map, parent);
		} 
		finally {
			list.remove(map);
		}
	}
	private static <K, V> String toString(Map<K, V> map, Map<K, V> parent) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");

		Iterator<Entry<K, V>> i = (parent == null ? map.entrySet().iterator() : parent.entrySet().iterator());
		boolean hasNext = i.hasNext();
		while (hasNext) {
			Entry<K, V> e = i.next();
			Object key = e.getKey();
			toString(sb, e.getKey());
			sb.append("=");
			
			Object value = null;
			
			if (parent ==null) {
				value = e.getValue();
			}
			else {
				value = map.keySet().contains(key) ? map.get(key) : e.getValue();
			}
			
			toString(sb, value);
			hasNext = i.hasNext();
			if (hasNext)
				sb.append(", ");
		}

		sb.append("}");
		return sb.toString();
	}

	private static void toString(StringBuilder sb, Object value) {
		Object[] v = ArrayUtil.asArray(value, false);
		if (v != null && v.length == 1) sb.append(value);
		else if (v != null && v.length > 20) {
			sb.append(Arrays.asList(Arrays.copyOfRange(v, 0, 20)));
			sb.append("[...]");
		}
		else
			sb.append(value);
	}
	
	private static boolean contains(List<Object> cache, Object value) {
		for (Object o : cache)
			if (o == value) return true;
		return false;
	}
	
	public static boolean isExists(Object obj) {
		if (obj == null) {
			return false;
		}
		return true;
	}
	
	public static String lpadding(String s, int n, String padding) {
		StringBuffer strbuf = new StringBuffer();
		for (int i = 0; i < n - s.length(); i++) {
			strbuf.append(padding);
		}
		strbuf.append(s);
		return strbuf.toString();
	}
	
	public static String multiPadding(String str, int multi, char ch) {
		if (str.length() % multi == 0) return str;
		return StringUtil.padding(str, (str.length() / multi + 1) * multi, ch);
	}
	
	public static String padding(String str, int len, char ch) {
		for (int i = str.length(); i < len; i++) {
			str += ch;
		}
		return str;
	}
	
	public static String unPadding(String str, char ch) {
		while (str.charAt(str.length() - 1) == ch) str = str.substring(0, str.length() - 1);
		return str;
	}

	public static String space(int n) {
		return space(' ', n);
	}

	public static String space(char space, int n) {
		String ret = "";
		for (int i = 0; i < n; i++) ret += space;
		return ret;
	}
}
