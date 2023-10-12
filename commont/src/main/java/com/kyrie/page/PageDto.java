package com.kyrie.page;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Auther: 冀金梁
 * @Date: 2023/10/12 21:20 周四
 * @Project_Name: skywolf-project
 * @Version: 1.0
 * @description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PageDto {
    private Long pageNum = 1L;
    private Long pageSize = 10L;
}
