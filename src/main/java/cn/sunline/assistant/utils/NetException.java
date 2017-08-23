package cn.sunline.assistant.utils;

/**
 * Net异常父类
 * 
 * @author zhangms
 *
 */
public class NetException extends RuntimeException {
	private static final long serialVersionUID = 1L;

    public NetException(String message){
    	super( message);
    }
    
    public NetException(String message, Throwable cause) {
    	super(message, cause);
    }
    
    public NetException(Throwable cause) {
    	super(cause);
    }
    
}
