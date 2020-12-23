package com.songlingapp;


import com.songlingapp.controller.SonglingController;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//import com.songlingadmin.service.SonglingService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ControllerTests {
    @Resource
    SonglingController songlingController;
    @Test
    public  void testConfig(){//测试可以
        log.info("fsdafdf");
        ;
     log.info(songlingController.getId(null).toString());

    }
}
