/**
 * 
 */
package cn.sunline.assistant.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caiqq
 *
 */
public class CommUtil_{
	
    public static Map<String, Object> toMap(Object bean) {
        if (bean == null) return null;
        if (bean instanceof Map) return (Map<String, Object>) bean;
        throw new RuntimeException("类型[%s]不是Map类型不能转换"+bean.getClass().getName());
    }
    
    public static String createGUID() {
        RandomGUID rg = new RandomGUID();
        return rg.getValueAfterMD5();
    }
//	/**
//	 * 将任意JavaBean对象转换为Map。注意转换的Map可能不支持clear方法！
//	 * @param bean
//	 * @return
//	 */
//	@SuppressWarnings("unchecked")
//	public static Map<String, Object> toMap(Object bean) {
//		if (bean == null) return null;
//		if (bean instanceof Map)  {
//			if (ModelUtil.isProxyClass(bean.getClass())) {
//				Map<String, Object> ret = new HashMap<String, Object>();
//				ret.putAll((Map<String, Object>)bean);
//				return ret;
//			}
//			return (Map<String, Object>) bean;
//		}
//		return BeanMap.create(bean);
//	}
	
	/**
	 * 将JavaBean的List转换为Map的List。注意转换的Map可能不支持clear方法！
	 * @param list
	 * @return
	 */
	public static List<Map<String, Object>> toListMap(List<?> list) {
		if (list == null) return null;
		List<Map<String, Object>> ret = new ArrayList<Map<String, Object>>();
		for (Object o : list) ret.add(toMap(o));
		return ret;
	}

	/**
	 * 判断对象是否为空， 若为空返回缺省值
	 * 
	 * 如果是字符串的话，判断是否全是空格或为null
	 * 
	 * @param o
	 *            待检测对象
	 * @param defaultValue
	 *            缺省值
	 * @return true 对象为空; false 对象不为空
	 */
	public static <T> T nvl(T s, T defaultValue) {
		return isNull(s) ? defaultValue : s;
	}

	/**
	 * 判断对象是否为空
	 * 
	 * 如果是字符串的话，判断是否全是空格或为null
	 * 
	 * @param o
	 *            待检测对象
	 * @return true 对象为空; false 对象不为空
	 */
	public static boolean isNull(Object o) {
		if (StringUtil.isEmpty(o))
			return true;
		return false;
	}

	/**
	 * 判断对象是否不为空
	 * 
	 * @param o
	 *            待检测对象
	 * @return true 对象不为空; false 对象为空
	 */
	public static boolean isNotNull(Object o) {
		return (!isNull(o));
	}

	/**
	 * 去掉字符串中前和后的空格
	 * 
	 * @param s
	 *            待处理字符串
	 * @return 去除前后空格后的结果字符串; 若字符串全是空格或null的话，结果返回null
	 */
	public static String trim(String s) {
		return (s == null) ? null : s.trim();
	}

	/**
	 * 去掉字符串中右边空格
	 * 
	 * @param s
	 *            待处理字符串
	 * @return 去除右边空格后的结果字符串
	 */
	public static String rtrim(String s) {
		if (s == null)
			return null;
		StringBuffer sb = new StringBuffer(s);
		for (int i = sb.length() - 1; i >= 0; i--) {
			if (sb.charAt(i) == ' ') {
				sb.deleteCharAt(i);
			} else {
				break;
			}
		}
		return sb.toString();
	}

	/**
	 * 去掉字符串中左边空格
	 * 
	 * @param s
	 *            待处理字符串
	 * @return 去除左边空格后的结果字符串
	 */
	public static String ltrim(String s) {
		if (s == null)
			return null;
		String ret = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			} else {
				ret = s.substring(i);
				break;
			}
		}
		return ret;
	}

	/**
     * 在指定字符左边根据指定长度添加指定的字符
     * 
     * @param s
     *            源字符
     * @param i
     *            添加后的长度
     * @param s1
     *            目标字符串
     * @return 目标字符串
     */
    public static String lpad(String s, int i, String s1) {
        if (s == null)
            return null;
        if (s1 == null || s1.length() <= 0)
            throw new IllegalArgumentException("进行lpad的添加字符串不能为null且长度不能为0!");
        if (i <= 0)
            throw new IllegalArgumentException("进行lpad的长度无效!");
        if (i <= s.length())
            return s.substring(0, i);
        else {
            StringBuffer sb = new StringBuffer(s);
            char[] c1 = s1.toCharArray();
            int index = 0;
            while (sb.length() < i) {
                // 添加一遍s1后没达到指定长度继续重复添加s1
                index = 0;
                while (sb.length() < i && index < c1.length) {
                    // 添加第index个字符时达到指定长度退出
                    sb.insert(0, c1[index++]);
                }
            }
            return sb.toString();
        }
    }
	
	/**
	 * 在指定字符左边根据指定长度添加指定的字符
	 * 
	 * @param s
	 *            源字符
	 * @param i
	 *            添加后的长度
	 * @param s1
	 *            目标字符串
	 * @return 目标字符串
	 */
	public static String lpad(String s, int i, String s1, String enCoding) {
		if (s == null)
			return null;
		if (s1 == null || s1.length() <= 0)
			throw new IllegalArgumentException("进行lpad的添加字符串不能为null且长度不能为0!");
		if (i <= 0)
			throw new IllegalArgumentException("进行lpad的长度无效!");
        try {
            byte []pad = s1.getBytes(enCoding);
            byte []by = s.getBytes(enCoding);
            byte []des = new byte[i];
            
            int srcLen = by.length;
            int padLen = pad.length;
            
            if (i <= srcLen){
                System.arraycopy(by, 0, des, 0, i);
                return new String(des, enCoding);
            }else {
                System.arraycopy(by, 0, des, i-srcLen, srcLen);
                while (srcLen < i) {
                    // 如果字符加源字段长度大于期望长度，则截取字符
                    if((padLen + srcLen) > i)
                        System.arraycopy(pad, 0, des, i-srcLen-padLen, 2*i-srcLen-padLen);
                    else
                        System.arraycopy(pad, 0, des, i-srcLen-padLen, padLen);
                    srcLen += padLen;
                }
                return new String(des, enCoding);
            }
        }catch(UnsupportedEncodingException e){
            throw new IllegalArgumentException("无效的编码值[" + enCoding + "]");
        }
	}

	/**
     * 在指定字符右边根据指定长度添加指定的字符
     * 
     * @param s
     *            源字符
     * @param i
     *            添加后的长度
     * @param s1
     *            目标字符串
     * @return 结果字符串
     */
    public static String rpad(String s, int i, String s1) {
        if (s == null)
            return null;
        if (s1 == null || s1.length() <= 0)
            throw new IllegalArgumentException("进行Rpad的添加字符串不能为null且长度不能为0!");
        if (i <= 0)
            throw new IllegalArgumentException("进行Rpad的长度无效!");
        if (i <= s.length())
            return s.substring(0, i);
        else {
            StringBuffer sb = new StringBuffer(s);

            char[] c1 = s1.toCharArray();
            int index = 0;
            while (sb.length() < i) {
                // 添加一遍s1后没达到指定长度继续重复添加s1
                index = 0;
                while (sb.length() < i && index < c1.length) {
                    // append第index个字符时达到指定长度退出
                    sb.append(c1[index++]);
                }
            }
            return sb.toString();
        }
    }
	
	/**
	 * 在指定字符右边根据指定长度添加指定的字符
	 * 
	 * @param s
	 *            源字符
	 * @param i
	 *            添加后的长度
	 * @param s1
	 *            目标字符串
	 * @return 结果字符串
	 */
	public static String rpad(String s, int i, String s1, String enCoding) {
		if (s == null)
			return null;
		if (s1 == null || s1.length() <= 0)
			throw new IllegalArgumentException("进行Rpad的添加字符串不能为null且长度不能为0!");
		if (i <= 0)
			throw new IllegalArgumentException("进行Rpad的长度无效!");
	      try{
	            byte []pad = s1.getBytes(enCoding);
	            byte []by = s.getBytes(enCoding);
	            byte []des = new byte[i];
	            
	            int srcLen = by.length;
	            int padLen = pad.length;
	            
	            if (i <= by.length){
	                System.arraycopy(by, 0, des, 0, i);
	                return new String(des, enCoding);
	            }else {
	                System.arraycopy(by, 0, des, 0, srcLen);
	                while (srcLen < i) {
	                    // 如果字符加源字段长度大于期望长度，则截取字符
	                    if((padLen + srcLen) > i)
	                        System.arraycopy(pad, 0, des, srcLen, 2*i-srcLen-padLen);
	                    else
	                        System.arraycopy(pad, 0, des, srcLen, padLen);
	                    srcLen += padLen;
	                }
	                return new String(des, enCoding);
	            }
	        }catch(UnsupportedEncodingException e){
	            throw new IllegalArgumentException("无效的编码值[" + enCoding + "]");
	        }
	}

	/**
	 * 类似SQL语句的Like，但不支持中间有%匹配
	 * 
	 * @param s1
	 *            源字符串
	 * @param s2
	 *            模式字符串
	 * @return true-若源字符串匹配模式字符串；否则返回false
	 */
	public static boolean like(String s1, String s2) {
		if (s1 == null || s2 == null)
			throw new IllegalArgumentException("like函数参数值无效!");
		int len = s2.length();
		boolean startWith = false;
		boolean endWith = false;

		if (s2.charAt(0) == '%')// 头有%
			startWith = true;

		// 检查模式字符串中间是否有%，若存在则抛出异常
		int p = s2.indexOf('%', 1);
		if (p > 0 && p < s2.length() - 1)
			throw new IllegalArgumentException("like函数不支持中间匹配!");

		// 尾有%
		if (s2.charAt(len - 1) == '%')
			endWith = true;

		s2 = s2.replace("%", "");
		if (startWith && endWith)
			return s1.indexOf(s2) >= 0;
		else if (startWith)
			return s1.startsWith(s2);
		else if (endWith)
			return s1.endsWith(s2);
		else
			return s1.equals(s2);
	}

	/**
	 * 判断一个值是否与后面所有值中的某个相等(类型必须相同)
	 * 
	 * <p>
	 * 注意：当字符串时根据字符的compareTo结果为0进行判断相等
	 * 
	 * @param a
	 *            源对象
	 * @param a1
	 *            集合对象
	 * @return true 源对象在集合中存在；否则返回false
	 */
	public static boolean in(Object a, Object... a1) {
		if (a == null)
			return false;
		if (a1 == null || a1.length <= 0)
			throw new IllegalArgumentException("In函数参数值无效!");
		for (int i = 0; i < a1.length; i++) {
			if (!a.getClass().isAssignableFrom(a1[i].getClass()))
				throw new IllegalArgumentException("In函数参数类型必须相同!");
			if (compare(a, a1[i]) == 0)
				return true;
		}
		return false;
	}

	/**
	 * 判断对象是否在List中。
	 */
	public static <T> boolean in(T object, List<T> objects) {
		return (objects.indexOf(object) >= 0);
	}
	
	/**
	 * 判断一个值是否在指定的两个值之间,注意：比较值的大小使用compare进行
	 * 
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public static boolean Between(Object a, Object start, Object end) {
		if (a == null || start == null || end == null)
			throw new IllegalArgumentException("Between函数参数值无效!");
		if (!a.getClass().isAssignableFrom(start.getClass()) || !a.getClass().isAssignableFrom(end.getClass()))
			throw new IllegalArgumentException("Between函数参数类型必须相同!");
		if (compare(a, start) >= 0 && compare(a, end) <= 0)
			return true;
		else
			return false;
	}
 
	
	/**
	 * 比较两个字符串大小(区分大小写)
	 * 
	 * @param o1 源对象
	 * @param o2 目标对象
	 * @param ignoreCase 是否忽略大小写 true-忽略 false-不忽略
	 * @param ignoreNullAndEmpty 是否视空字符串与null是相等的
	 * @return 负数,0,正数 分别表示结果为小于，等于和大于
	 */
//	public static int compare(String o1, String o2, boolean ignoreCase, boolean ignoreNullAndEmpty) {
//		if (o1 == null && o2 == null)
//			return 0;
//		if (o1 == null && o2 != null){
//			if (ignoreNullAndEmpty && "".equals(o2)) {
//				return 0;
//			}
//			return -1;
//		}
//		if (o1 != null && o2 == null) {
//			if (ignoreNullAndEmpty && "".equals(o1)) {
//				return 0;
//			}
//			return 1;
//		}
//		if (ignoreCase)
//			return o1.compareToIgnoreCase(o2);
//		else 
//			return o1.compareTo(o2);
//	}
	
	/**
	 * 
	 * @param o1 
	 * @param o2
	 * @param ignoreCase 针对字符串     忽略大小写比较
	 * @param ignoreNullAndEmpty 针对字符串  是否忽略null与空字符串 比较
	 * @return
	 */
	public static <T extends Comparable<? super T>>  int compare(T o1, T o2,boolean ignoreCase, boolean ignoreNullAndEmpty) {
		return ComparableUtil.compare(o1, o2, ignoreCase, ignoreNullAndEmpty);
		
//		if (BigDecimal.class.isAssignableFrom(o1.getClass())) {
//			// 注意：new BigDecimal(1.23).compareTo(new BigDecimal("1.23"))结果将不为0
//			return ((BigDecimal) o1).compareTo((BigDecimal) o2);
//		} 
//		if (Date.class.isAssignableFrom(o1.getClass())) {
//			return ((Date) o1).compareTo((Date) o2);
//		} 
//		if (java.sql.Date.class.isAssignableFrom(o1.getClass())) {
//			return ((java.sql.Date) o1).compareTo((java.sql.Date) o2);
//		}  
//		if (java.sql.Time.class.isAssignableFrom(o1.getClass())) {
//			return ((java.sql.Time) o1).compareTo((java.sql.Time) o2);
//		}  
//		if (java.sql.Timestamp.class.isAssignableFrom(o1.getClass())) {
//			return ((java.sql.Timestamp) o1).compareTo((java.sql.Timestamp) o2);
//		}  
//		if (Short.class.isAssignableFrom(o1.getClass())) {
//			return ((Short) o1).compareTo((Short) o2);
//		}  
//		if (Integer.class.isAssignableFrom(o1.getClass())) {
//			return ((Integer) o1).compareTo((Integer) o2);
//		}  
//		if (Long.class.isAssignableFrom(o1.getClass())) {
//			return ((Long) o1).compareTo((Long) o2);
//		}  
//		if (Float.class.isAssignableFrom(o1.getClass())) {
//			return ((Float) o1).compareTo((Float) o2);
//		}  
//		if (Double.class.isAssignableFrom(o1.getClass())) {
//			return ((Double) o1).compareTo((Double) o2);
//		}  
//		if (ByRef.class.isAssignableFrom(o1.getClass())) {
//			return compare(((ByRef<?>) o1).value, ((ByRef<?>) o2).value);
//		}  
		
	}
	

	/**
	 * 任何对象的比较，跳过编译器检查
	 * 
	 * 但运行期会要求：比较的2个对象必须是Comparable
	 * 
	 * 
	 * 默认忽略null与空字符串的比较
	 * 
	 * @param o1
	 * @param o2
	 * @return
	 */
	public static int compare(Object o1, Object o2) {
	   return ComparableUtil.compare(o1, o2);
	}
	
	

	/**
	 * 金额小数点截除函数
	 * 
	 * @param am
	 *            待处理金额
	 * @return 处理后的金额
	 */
	public static BigDecimal trunc(BigDecimal am) {
		return am == null ? null : Convert.toBigDecimal(am, (BigDecimal) null);
	}

	/**
	 * 将BigDecimal类型金额按指定小数点后的位数进行四舍五入处理
	 * 
	 * @param amt
	 *            -金额
	 * @param scale
	 *            -保留小数点后的位数
	 * @return 返回处理后的金额
	 */
	public static BigDecimal round(BigDecimal amt, int scale) {
		return round(amt, scale, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * 将BigDecimal类型进行小数点后精度处理
	 * 
	 * @param amt
	 * @param scale
	 *            -保留小数点后的位数
	 * @param roundingMode
	 *            -BigDecimal.ROUND_CEILING,ROUND_FLOOR,...
	 * @return
	 */
	public static BigDecimal round(BigDecimal amt, int scale, int roundingMode) {
		if (amt == null)
			return null;
		if (scale < 0)
			throw new IllegalArgumentException("round精度不能为负数!");
		return amt.setScale(scale, roundingMode);
	}

	/**
	 * 向下取整函数
	 * 
	 * @param val
	 *            金额数值（可以为Double、BigDecimal、Float类型）
	 * @return 返回最大的值，该值小于等于参数，并等于某个整数。
	 */
	public static long floor(Object val) {
		if (val == null)
			throw new IllegalArgumentException("Floor参数不能为null!");
		if (val instanceof BigDecimal)
			return ((BigDecimal) val).longValue();
		else if (val instanceof Double || val instanceof Float)
			return new Double(Math.floor((Double) val)).longValue();
		else if (val instanceof Long)
			return (Long) val;
		return 0;
	}
	
	/**
	 * 向上取整函数
	 * 
	 * @param val
	 *            金额数值（可以为Double、BigDecimal、Float类型）
	 * @return 返回最小的值，该值大于等于参数，并等于某个整数
	 */
	public static long ceil(Object val) {
		if (val == null)
			throw new IllegalArgumentException("Ceil参数不能为null!");
		if (val instanceof BigDecimal)
			return round((BigDecimal) val, 0, BigDecimal.ROUND_CEILING).longValue();
		else if (val instanceof Double || val instanceof Float)
			return new Double(Math.ceil((Double) val)).longValue();
		return 0;
	}
	
	public static boolean equals(Object o1, Object o2) {
		return compare(o1, o2) == 0;
	}
	
	public static Map<String, Object> shrinkHttpParameters(Map<String, String[]> parameters) {
		boolean decode = parameters.containsKey("q:");
		Map<String, Object> ret = new HashMap<String, Object>();
		for (Map.Entry<String, String[]> entry : parameters.entrySet()) {
			String[] value = entry.getValue();
			String[] val = value;
			if (val.length == 1) 
				ret.put(entry.getKey(), convertHtmlParameter(val[0], decode));
			else {
				List<String> values = new ArrayList<String>();
				for (String v : val) 
					if (!StringUtil.isEmpty(v)) 
						values.add(convertHtmlParameter(v, decode));
				ret.put(entry.getKey(), values.toArray(new String[values.size()]));
			}
		}
		return ret;
	}
	
	private static String convertHtmlParameter(String p, boolean decode) {
		if (decode) try {
			p = new String(p.getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
		// 防止跨站攻击
		if (StringUtil.isNotEmpty(p)) p = p.replaceAll("(?im)<([\\s/]*(script|iframe|img))", "&lt;$1");
		return p;
	}
	
}
