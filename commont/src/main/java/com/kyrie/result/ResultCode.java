package com.kyrie.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 17:15 周四
 * @Project_Name: skywolf-project
 * @Version: 1.0
 * @description 返回枚举码
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public enum ResultCode implements Serializable {

    SUCCESS("201","一切ok"),
    PARAM_ERRPR("P400","非法参数"),
    SYSTEM_EXCEPTION_ERROR("B001","系统异常错误");
    private String code;
    private String msg;

    static ResultCode getValue(String code) {
        for (ResultCode value : values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return SYSTEM_EXCEPTION_ERROR;
    }
}
