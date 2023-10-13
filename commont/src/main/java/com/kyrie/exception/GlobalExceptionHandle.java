package com.kyrie.exception;

import com.kyrie.result.Result;
import com.kyrie.result.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/13 19:28 周五
 * @Project_Name: skywolf-project
 * @Version: 1.0
 * @description 全局异常处理类
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandle {

    /**
     * 自定义业务异常
     * @param e
     * @return
     * @param <E>
     */
    @ExceptionHandler(BizException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public<E> Result<E> handleBizException(BizException e){
        log.error("业务异常：{}",e.getMessage(),e);
        if (e.getResultCode() != null) return Result.failed(e.getResultCode());
        return Result.failed(ResultCode.SYSTEM_EXCEPTION_ERROR,e.getMessage());
    }

    /**
     *  系统未知异常
     * @param e
     * @return
     * @param <E>
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public <E> Result<E> handleException(Exception e) {
        return Result.failed(e.getLocalizedMessage());
    }
}
