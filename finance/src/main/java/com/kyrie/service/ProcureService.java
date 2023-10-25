package com.kyrie.service;

import com.kyrie.page.PageParam;
import com.kyrie.pojo.FnsProcure;
import com.kyrie.pojo.dto.QureyParam;

import java.util.List;

/**
 * @auther: jijin
 * @date: 2023/10/23 20:52 周一
 * @project_name: skywolf-project
 * @version: 1.0
 * @description TODO
 */
public interface ProcureService {

    List<FnsProcure> getProcureTable(PageParam pageParam, QureyParam qureyParam);
}
