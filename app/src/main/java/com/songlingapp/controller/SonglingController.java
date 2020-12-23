package com.songlingapp.controller;


import com.songlingapp.entity.Songling;
import com.songlingapp.service.SonglingService;
import com.songlingapp.util.R;
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
    public R getId(String userId){
        Songling sl=new Songling();
        sl.setName("sllll");
        songlingService.save(sl);
        return  R.  ok("基础测试"+sl.getId());
    }

}

