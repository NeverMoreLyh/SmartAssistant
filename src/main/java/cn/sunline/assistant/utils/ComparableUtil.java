package cn.sunline.assistant.utils;

/**
 * 
 * @author lizhs
 * @date   2015年10月13日
 * 
 * @see cn.sunline.ltts.biz.global.CommUtil
 */
public class ComparableUtil {
    /**
     * 
     * 枚举类型的比较采用字符串比较，并支持枚举类型与字符串比较
     * 
     * @param o1 
     * @param o2
     * @param ignoreCase 针对字符串     忽略大小写比较
     * @param ignoreNullAndEmpty 针对字符串  是否忽略null与空字符串 比较
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<? super T>>  int compare(T o1, T o2,boolean ignoreCase, boolean ignoreNullAndEmpty) {
        if (o1 == o2)
            return 0;
        
        if (o1 == null){
            if (ignoreNullAndEmpty && String.class.isAssignableFrom(o2.getClass()) && "".equals(o2)) {
                return 0;
            }
            return -1;
        }
        if (o2 == null) {
            if (ignoreNullAndEmpty && String.class.isAssignableFrom(o1.getClass()) && "".equals(o1)) {
                return 0;
            }
            return 1;
        }
        
        if (ignoreCase && String.class.isAssignableFrom(o1.getClass()) && String.class.isAssignableFrom(o2.getClass())) {
              return ((String)o1).compareToIgnoreCase((String)o2);
        }
        
        if(o1 !=null  && o1.getClass().isEnum()){
            o1=(T) String.valueOf(o1);
        }
        
        if(o2 !=null  && o2.getClass().isEnum()){
            o2=(T) String.valueOf(o2);
        }
        //这里存在类型不一致的风险，属运行期异常
        return o1.compareTo(o2);
    }
    
    /**
     * 任何对象的比较，跳过编译器检查
     * 
     * 但运行期会要求：比较的2个对象必须是Comparable
     * 
     * 默认忽略null与空字符串的比较
     * 
     * @param o1
     * @param o2
     * @return
     */
    public static int compare(Object o1, Object o2) {
        if(o1!=null && !(o1 instanceof  Comparable<?>)){
            throw LangUtil.wrapThrow("比较[%s]的类型[%s]必须是Comparable,否则无法进行比较", o1.toString(),o1.getClass().getName());
        }
        if(o2!=null && !(o2 instanceof  Comparable<?>)){
            throw LangUtil.wrapThrow("比较[%s]的类型[%s]必须是Comparable,否则无法进行比较", o2.toString(),o2.getClass().getName());
        }
        
        return compare((Comparable)o1, (Comparable)o2,false, true);
    }
}
