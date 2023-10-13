package com.kyrie.exception;

import com.kyrie.result.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/13 19:30 周五
 * @Project_Name: skywolf-project
 * @Version: 1.0
 * @description TODO
 */
@Getter
public class BizException extends RuntimeException{

    private static final long serialVersionUID = 5460882618698803685L;

    private ResultCode resultCode;

    public BizException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(Throwable cause){
        super(cause);
    }

    public BizException(String message,Throwable cause) {
        super(message,cause);
    }

}
