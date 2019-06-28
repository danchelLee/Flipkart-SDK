package com.sw.client.exception;

/**
 * @Author: Dc Lee
 * @Descpription:
 * @Date: 15:09 2019/4/1
 */
public class SwException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = -1828858210195741131L;

    protected String          errorCode;

    protected String          errorMessage;

    /**
     * 获取返回的error_code错误码
     *
     * @return
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 获取返回的error_message错误信息
     *
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public SwException(){
    }

    /**
     * @param message
     */
    public SwException(String message){
        super(message);
        this.errorMessage = message;
    }

    /**
     * @param message
     */
    public SwException(String errorCode, String message){
        super(message);
        this.errorCode = errorCode;
        this.errorMessage = message;
    }

    /**
     * @param cause
     */
    public SwException(Throwable cause){
        super(cause);
    }

    /**
     * @param message
     * @param cause
     */
    public SwException(String message, Throwable cause){
        super(message, cause);
    }
}
