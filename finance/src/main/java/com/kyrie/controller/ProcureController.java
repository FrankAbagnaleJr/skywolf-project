package com.kyrie.controller;

import com.kyrie.page.PageParam;
import com.kyrie.pojo.FnsProcure;
import com.kyrie.pojo.dto.QureyParam;
import com.kyrie.result.Result;
import com.kyrie.service.ProcureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther: jijin
 * @date: 2023/10/23 20:52 周一
 * @project_name: skywolf-project
 * @version: 1.0
 * @description TODO
 */
@RestController
@RequestMapping("/v1")
public class ProcureController {

    @Autowired
    private ProcureService procureService;

    @GetMapping("/procure")
    public Result<List<FnsProcure>> getProcureTable(PageParam pageParam, QureyParam qureyParam){
        List<FnsProcure> list = procureService.getProcureTable(pageParam,qureyParam);





        return Result.success(list);
    }
}
