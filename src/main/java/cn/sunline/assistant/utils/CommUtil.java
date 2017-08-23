package cn.sunline.assistant.utils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.reflect.FieldUtils;

/**
 * 公用工具函数
 * 
 * @author zms
 * 
 */
public class CommUtil {

	/**
	 * 将任意JavaBean对象转换为Map。注意转换的Map可能不支持clear方法！
	 * 
	 * @param bean
	 * @return
	 */
	public static Map<String, Object> toMap(Object bean) {
		return CommUtil_.toMap(bean);
	}

	/**
	 * 将JavaBean的List转换为Map的List。注意转换的Map可能不支持clear方法！
	 * 
	 * @param list
	 * @return
	 */
	public static List<Map<String, Object>> toListMap(List<?> list) {
		return CommUtil_.toListMap(list);
	}


	/**
	 * 获取属性的类型
	 */
	@SuppressWarnings("rawtypes")
	public static Class getPropType(Class<?> clazz, String fieldName) {
		Field field = FieldUtils.getField(clazz, fieldName);
		if (field != null)
			return field.getType();
		return null;
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
		return CommUtil_.nvl(s, defaultValue);
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
		return CommUtil_.isNull(o);
	}

	/**
	 * 判断对象是否不为空
	 * 
	 * @param o
	 *            待检测对象
	 * @return true 对象不为空; false 对象为空
	 */
	public static boolean isNotNull(Object o) {
		return CommUtil_.isNotNull(o);
	}

	/**
	 * 去掉字符串中前和后的空格
	 * 
	 * @param s
	 *            待处理字符串
	 * @return 去除前后空格后的结果字符串; 若字符串全是空格或null的话，结果返回null
	 */
	public static String trim(String s) {
		return CommUtil_.trim(s);
	}

	/**
	 * 去掉字符串中右边空格
	 * 
	 * @param s
	 *            待处理字符串
	 * @return 去除右边空格后的结果字符串
	 */
	public static String rtrim(String s) {
		return CommUtil_.rtrim(s);
	}

	/**
	 * 去掉字符串中左边空格
	 * 
	 * @param s
	 *            待处理字符串
	 * @return 去除左边空格后的结果字符串
	 */
	public static String ltrim(String s) {
		return CommUtil_.ltrim(s);
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
        return CommUtil_.lpad(s, i, s1);
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
	 * @param enCoding
	 *            字符编码
	 * @return 目标字符串
	 */
	public static String lpad(String s, int i, String s1 ,String enCoding) {
		return CommUtil_.lpad(s, i, s1, enCoding);
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
        return CommUtil_.rpad(s, i, s1);
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
     * @param enCoding
     *            字符编码
	 * @return 结果字符串
	 */
	public static String rpad(String s, int i, String s1, String enCoding) {
		return CommUtil_.rpad(s, i, s1, enCoding);
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
		return CommUtil_.like(s1, s2);
	}

//	/**
//	 * 判断一个值是否是枚举类型定义的常量
//	 * 
//	 * @param enumCls
//	 *            枚举类型类
//	 * @param value
//	 *            目标值
//	 * @return true 如果目标值是枚举类型定义的常量；否则返回false
//	 */
//	public static <T extends Enum<T>> boolean isInEnum(Class<T> enumCls, Object value) {
//		return EnumUtils.isInEnum(enumCls, value);
//	}
//
//	/**
//	 * 将一个值转化为枚举类型对象
//	 * 
//	 * @param enumCls
//	 *            枚举类型类
//	 * @param value
//	 *            目标值
//	 * @return 枚举类型 注意：目标值需要与枚举类型里定义的某个常量相等才能完成转化，否则返回null
//	 */
//	public static <T extends Enum<T>> T toEnum(Class<T> enumCls, Object value) {
//		return EnumUtils.toEnum(enumCls, value);
//	}

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
		return CommUtil_.in(a, a1);
	}

	/**
	 * 判断对象是否在List中。
	 */
	public static <T> boolean in(T object, List<T> objects) {
		return CommUtil_.in(object, objects);
	}

	/**
	 * 判断一个值是否在指定的两个值之间,注意：比较值的大小使用compare进行
	 * 
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	public static boolean Between(String a, String start, String end) {
		return CommUtil_.Between(a, start, end);
	}
	
	public static boolean Between(Integer a, int start, int end) {
		return CommUtil_.Between(a, start, end);
	}
	public static boolean Between(int a, int start, int end) {
		return CommUtil_.Between(a, start, end);
	}
	public static boolean Between(BigDecimal a, BigDecimal start, BigDecimal end) {
		return CommUtil_.Between(a, start, end);
	}

    /**
     * 比较两个对象大小
     * 
     * 如果是字符串比较，空字符串与null是相等的
     *  
     * 
     * @param o1
     *            源对象
     * @param o2 目标对象
     * @return 负数,0,正数 分别表示结果为小于，等于和大于
     */
	public static <T extends Comparable<T>> int compare(T o1, T o2) {
		return CommUtil_.compare(o1, o2,false, true);
	}

	/**
	 * 比较两个字符串大小(区分大小写)
	 * 
	 * @param o1
	 *            源对象
	 * @param o2
	 *            目标对象
	 * @return 负数,0,正数 分别表示结果为小于，等于和大于 </br>注：视空字符串与null是相等的
	 */
//	public static int compare(String o1, String o2) {
//		return CommUtil_.compare(o1, o2, false, true);
//	}

	/**
	 * 比较两个字符串大小(不区分大小写)
	 * 
	 * @param o1
	 *            源对象
	 * @param o2
	 *            目标对象
	 * @return 负数,0,正数 分别表示结果为小于，等于和大于 </br>注：视空字符串与null是相等的
	 */
	public static int compareIgnoreCase(String o1, String o2) {
		return CommUtil_.compare(o1, o2, true, true);
	}

	/**
	 * 比较两个字符串大小(区分大小写)
	 * 
	 * @param o1
	 *            源对象
	 * @param o2
	 *            目标对象
	 * @param ignoreCase
	 *            是否忽略大小写 true-忽略 false-不忽略
	 * @param ignoreNullAndEmpty
	 *            是否视空字符串与null是相等的
	 * @return 负数,0,正数 分别表示结果为小于，等于和大于
	 */
//	public static int compare(String o1, String o2, boolean ignoreCase, boolean ignoreNullAndEmpty) {
//		return CommUtil_.compare(o1, o2, ignoreCase, ignoreNullAndEmpty);
//	}

	/**
	 * 判断两个BiDecimal对象是否相等
	 * 
	 * @param o1
	 * @param o2
	 * @return
	 */
	public static boolean equals(BigDecimal o1, BigDecimal o2) {
		return CommUtil_.compare(o1, o2) == 0;
	}

	/**
	 * 判断两个字符串是否相等（不区分大小写）
	 * 
	 * @param o1
	 *            字符串1
	 * @param o2
	 *            字符串2
	 * @return </br>注：视空字符串与null是相等的
	 */
	public static boolean equals(String str1, String str2) {
		return CommUtil_.compare(str1, str2, false, true) == 0;
	}

	/**
	 * 判断两个字符串是否相等（区分大小写）
	 * 
	 * @param o1
	 *            字符串1
	 * @param o2
	 *            字符串2
	 * @return </br>注：视空字符串与null是相等的
	 */
	public static boolean equalsIgnoreCase(String str1, String str2) {
		return CommUtil_.compare(str1, str2, true, true) == 0;
	}

	/**
	 * 判断两个字符串是否相等
	 * 
	 * @param o1
	 *            字符串1
	 * @param o2
	 *            字符串2
	 * @param ignoreCase
	 *            是否忽略大小写 true-忽略 false-不忽略
	 * @param ignoreNullAndEmpty
	 *            是否视空字符串与null是相等的
	 * @return
	 */
	public static boolean equals(String str1, String str2, boolean ignoreCase,
			boolean ignoreNullAndEmpty) {
		return CommUtil_.compare(str1, str2, ignoreCase, ignoreNullAndEmpty) == 0;
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
	private static BigDecimal round(BigDecimal amt, int scale, int roundingMode) {
		return CommUtil_.round(amt, scale, roundingMode);
	}

	/**
	 * 向下取整函数
	 * 
	 * @param val
	 *            金额数值（可以为Double、BigDecimal、Float类型）
	 * @return 返回最大的值，该值小于等于参数，并等于某个整数。
	 */
	public static long floor(Object val) {
		return CommUtil_.floor(val);
	}

	/**
	 * 向上取整函数
	 * 
	 * @param val
	 *            金额数值（可以为Double、BigDecimal、Float类型）
	 * @return 返回最小的值，该值大于等于参数，并等于某个整数
	 */
	public static long ceil(Object val) {
		return CommUtil_.ceil(val);
	}

	/**
	 * 数据的加减乘除
	 * 
	 * @param data1
	 *            和 data2 支持类型为 int ,Integer,long Long,BigDecimal
	 */

	public static enum Operator {
		/**
		 * add - 加
		 * 
		 */
		add("add", "add", "加"){
			@Override
			public Object add(Object data1, Object data2) {
				if (data1.getClass() == Integer.class && data2.getClass() == Integer.class) {
					Integer l1 = (Integer) data1;
					Integer l2 = (Integer) data2;
					return new Integer(l1.intValue() + l2.intValue());
				}
				if (data1.getClass() == Long.class && data2.getClass() == Long.class) {
					Long l1 = (Long) data1;
					Long l2 = (Long) data2;
					return new Long(l1.longValue() + l2.longValue());
				}
				if (data1.getClass() == BigDecimal.class && data2.getClass() == BigDecimal.class) {
					BigDecimal l1 = (BigDecimal) data1;
					BigDecimal l2 = (BigDecimal) data2;
					return l1.add(l2);
				}
				return null;
			}
		},
		/**
		 * sub - 减
		 * 
		 */
		sub("sub", "sub", "减"){
			@Override
			public Object sub(Object data1, Object data2) {
				if (data1.getClass() == Integer.class && data2.getClass() == Integer.class) {
					Integer l1 = (Integer) data1;
					Integer l2 = (Integer) data2;
					return new Integer(l1.intValue() - l2.intValue());
				}
				if (data1.getClass() == Long.class && data2.getClass() == Long.class) {
					Long l1 = (Long) data1;
					Long l2 = (Long) data2;
					return new Long(l1.longValue() - l2.longValue());
				}
				if (data1.getClass() == BigDecimal.class && data2.getClass() == BigDecimal.class) {
					BigDecimal l1 = (BigDecimal) data1;
					BigDecimal l2 = (BigDecimal) data2;
					return l1.subtract(l2);
				}
				return null;
			}
		},
		/**
		 * mul - 乘
		 * 
		 */
		mul("mul", "mul", "乘"){
			@Override
			public Object mul(Object data1, Object data2) {
				if (data1.getClass() == Integer.class && data2.getClass() == Integer.class) {
					Integer l1 = (Integer) data1;
					Integer l2 = (Integer) data2;
					return new Integer(l1.intValue() * l2.intValue());
				}
				if (data1.getClass() == Long.class && data2.getClass() == Long.class) {
					Long l1 = (Long) data1;
					Long l2 = (Long) data2;
					return new Long(l1.longValue() * l2.longValue());
				}
				if (data1.getClass() == BigDecimal.class && data2.getClass() == BigDecimal.class) {
					BigDecimal l1 = (BigDecimal) data1;
					BigDecimal l2 = (BigDecimal) data2;
					return l1.multiply(l2);
				}
				return null;
			}
		},
		/**
		 * div - 除
		 * 
		 */
		div("div", "div", "除"){
			@Override
			public Object div(Object data1, Object data2) {
				if (data1.getClass() == Integer.class && data2.getClass() == Integer.class) {
					Integer l1 = (Integer) data1;
					Integer l2 = (Integer) data2;
					return new Integer(l1.intValue()/l2.intValue());
				}
				if (data1.getClass() == Long.class && data2.getClass() == Long.class) {
					Long l1 = (Long) data1;
					Long l2 = (Long) data2;
					return new Long(l1.longValue() / l2.longValue());
				}
				if (data1.getClass() == BigDecimal.class && data2.getClass() == BigDecimal.class) {
					BigDecimal l1 = (BigDecimal) data1;
					BigDecimal l2 = (BigDecimal) data2;
					return l1.divide(l2);
				}
				return null;
			}
		};
		private String id;
		private String value;
		private String longName;
		private Operator(String id, String value, String longName) {
			this.id = id;
			this.value = value;
			this.longName = longName;
		}
		public Object add(Object data1, Object data2) {
			 return null;
		 }
		public Object sub(Object data1, Object data2)  {
			 return null;
		 }
		public Object mul(Object data1, Object data2)  {
			 return null;
		 }
		public Object div(Object data1, Object data2)  {
			 return null;
		 }
	}
}
