package com.kyrie.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.util.calendar.BaseCalendar;

import java.io.Serializable;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 10:46 周四
 * @Project_Name: skywolf-project
 * @Version: 1.0
 * @description 统一返回给前端的类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)  //null值不会序列化，也就不会返回给前端
public class Result<T> implements Serializable {
    private static final long seriaVersionUID = -3755762471234699039L;
    private String code;
    private String message;
    private T data;

    public static <T> Result<T> success() {
        return new Result<>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), null);
    }

    public static <T> Result<T> success(T data) {
        ResultCode res = ResultCode.SUCCESS;
        if (data instanceof Boolean && Boolean.FALSE.equals(data)) res = ResultCode.SYSTEM_EXCEPTION_ERROR;
        return new Result<>(res.getCode(),res.getMsg(), data);
    }
    public static <T> Result<T> success(String msg) {
        return new Result<>(ResultCode.SUCCESS.getCode(), msg, null);
    }

    public static <T> Result<T> failed(){
        return new Result<T>(ResultCode.SYSTEM_EXCEPTION_ERROR.getCode(), ResultCode.SYSTEM_EXCEPTION_ERROR.getMsg(), null);
    }

    public static <T> Result<T> failed(String message) {
        return new Result<T>(ResultCode.SYSTEM_EXCEPTION_ERROR.getCode(), message,null);
    }

    public static <T> Result<T> failed(ResultCode resultCode) {
        return new Result<T>(resultCode.getCode(),resultCode.getMsg(),null);
    }


    public static <T> Result<T> failed(ResultCode resultCode,String msg) {
        return new Result<T>(resultCode.getCode(),msg,null);
    }

    public static <T> Result<T> failed(ResultCode resultCode,T data) {
        return new Result<T>(resultCode.getCode(),resultCode.getMsg(),data);
    }

    public static <T> Result<T> failed(T data){
        return new Result<T>(ResultCode.SYSTEM_EXCEPTION_ERROR.getCode(), ResultCode.SYSTEM_EXCEPTION_ERROR.getMsg(), data);
    }


}
