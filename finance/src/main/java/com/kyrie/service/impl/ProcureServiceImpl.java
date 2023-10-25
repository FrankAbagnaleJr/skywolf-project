package com.kyrie.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kyrie.mapper.FnsProcureMapper;
import com.kyrie.page.PageParam;
import com.kyrie.pojo.FnsProcure;
import com.kyrie.pojo.dto.QureyParam;
import com.kyrie.service.ProcureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther: jijin
 * @date: 2023/10/23 20:52 周一
 * @project_name: skywolf-project
 * @version: 1.0
 * @description TODO
 */
@Service
public class ProcureServiceImpl implements ProcureService {
    @Autowired
    private FnsProcureMapper fnsProcureMapper;

    @Override
    public List<FnsProcure> getProcureTable(PageParam pageParam, QureyParam qureyParam) {

        Page page = new Page(pageParam.getPageNum(),pageParam.getPageSize());




        return null;
    }
}
