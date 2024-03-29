package com.mycode.testcode.result;

/**
 * Created by dailiuyang on 2019/8/13.
 * 应用系统级别的错误码
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface{

    SUCCESS("0", "success"),
    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
