package com.gk.hgx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LENOVO on 2018/12/10.
 * 2018/12/10
 *  
 * <p>
 * 11:06
 * 作者：黄桂鑫
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/login")
    public String toLogin(){
        return "login";
    }


    @RequestMapping("/crud")
    public String toCrud(){
        return "crud";
    }


    @RequestMapping("/demo")
    public String toDemo(){
        return "demo";
    }


    @RequestMapping("/index")
    public String toHgx(){
        return "hgx";
    }



}



