package com.mycode.testcode.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName GlobalErrorInfoHandler
 * Description: 统一错误码异常处理
 * @Author dailiuyang
 * @Date 2019/8/13 18:24
 **/
@RestControllerAdvice
public class GlobalErrorInfoHandler {
    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody errorHandlerOverJson(HttpServletRequest request,
                                           GlobalErrorInfoException exception) {
        ErrorInfoInterface errorInfo = exception.getErrorInfo();
        ResultBody result = new ResultBody(errorInfo);
        return result;
    }

}
