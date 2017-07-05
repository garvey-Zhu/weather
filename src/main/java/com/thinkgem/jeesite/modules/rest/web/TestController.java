package com.thinkgem.jeesite.modules.rest.web;

import com.thinkgem.jeesite.common.web.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Garvey on 2017/7/4.
 */
@RequestMapping("/${frontPath}/test")
@RestController("myTestController")
public class TestController extends BaseController {

    @RequestMapping(method = RequestMethod.GET)
    public String getTest(){
        return "hello world";
    }
}
