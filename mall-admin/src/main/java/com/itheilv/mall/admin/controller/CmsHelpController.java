package com.itheilv.mall.admin.controller;


import com.itheilv.mall.admin.model.CmsHelp;
import com.itheilv.mall.admin.service.CmsHelpService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 帮助表 前端控制器
 * </p>
 *
 * @author WSQ
 * @since 2020-09-07
 */
@RestController
@RequestMapping("/admin/cmsHelp")
public class CmsHelpController {

    @Autowired
    private CmsHelpService cmsHelpService;

    @ApiOperation("测试")
    @GetMapping("/test")
    public Object getTest() {
        List<CmsHelp> list = cmsHelpService.list();
        return list;
    }
}

