package com.mycode.testcode.result;

/**
 * @ClassName GlobalErrorInfoException
 * Description: 统一错误码异常
 * @Author dailiuyang
 * @Date 2019/8/13 18:22
 **/
public class GlobalErrorInfoException extends Exception {

    private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException (ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}