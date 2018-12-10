package com.gk.hgx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by LENOVO on 2018/12/10.
 * 2018/12/10
 *  
 * <p>
 * 10:44
 * 作者：黄桂鑫
 */
@Controller
public class hello {

    @RequestMapping("/hgx")
    @ResponseBody
    public String hello(){
        return "hgx";
    }


}
