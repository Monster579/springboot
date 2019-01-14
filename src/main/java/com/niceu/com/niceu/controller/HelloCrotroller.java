package com.niceu.com.niceu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2019/1/9.
 */

@RestController
@RequestMapping("/hello")
public class HelloCrotroller {

    @RequestMapping
    public String Hello(){
        return "HELLO WORLD";
    }

    @RequestMapping("/info")
    public Map<String,String> getInfo(String name){
        Map<String,String> map=new HashMap<>();
        map.put("name", name);
        return map;
    }

    @RequestMapping("/list")
    public List<Map<String,String>> getList(){
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;
        for (int i = 1; i <= 5; i++) {
            map = new HashMap<>();
            map.put("name", "mkdlp-" + i);
            list.add(map);
        }
        return list;
    }

    @RequestMapping("/index")
    public String index() {
        // 由于第2步的配置，此处返回的/index2实际上是/WEB-INF/jsp/index2.jsp
        // 返回的地址前不要加"/"，如"/index2"，会导致部署后项目找不到模板
        return "index";
    }

}
