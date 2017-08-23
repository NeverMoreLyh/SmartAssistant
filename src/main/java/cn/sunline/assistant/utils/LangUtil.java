package cn.sunline.assistant.utils;

/**
 * jdk lang包扩展工具类。
 * 
 * @author zms
 *
 */
public class LangUtil {
    public static NetException wrapThrow(Throwable e) {
        if (e instanceof NetException)
            return (NetException) e;
        return new NetException(e);
    }

    public static NetException wrapThrow(String message, Throwable e) {
        return new NetException(message, e);
    }

    public static NetException wrapThrow(String format, String... args) {
        throw new NetException(String.format(format, args));
    }

    public static <T> boolean isException(Throwable targetException, Class<?>  exClass) {
        if (exClass == null)
            return false;
        if (targetException.getClass().isAssignableFrom(exClass))
            return true;
        return isException(targetException.getCause(), exClass);
    }

    public static NetException wrapThrow(String format, Throwable e, String... args) {
        return new NetException(String.format(format, args), e);
    }

}
