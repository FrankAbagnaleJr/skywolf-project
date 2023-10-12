package com.kyrie.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.util.calendar.BaseCalendar;

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
public class Result<T> {
    private String code;
    private String message;
    private T data;

}
