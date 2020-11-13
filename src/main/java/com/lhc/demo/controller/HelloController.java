package com.lhc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 起飞
 *
 * @author liuhongcheng
 * @since 2020/11/13 14:08
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}
