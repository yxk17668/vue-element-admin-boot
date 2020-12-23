package com.songlingadmin.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.songlingadmin.entity.Songling;
import com.songlingadmin.service.SonglingService;
import com.songlingadmin.service.SonglingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author songling
 * @since 2020-07-01
 */
@Controller
@RequestMapping("/songling")
public class SonglingController {
    @Resource
    SonglingService songlingService;

    @GetMapping("/getId")
    public AjaxResult getId(String userId){
        Songling sl=new Songling();
        sl.setName("sllll");
        songlingService.save(sl);
        return AjaxResult.success("基础测试"+sl.getId());
//        return AjaxResult.success("");
    }

}

