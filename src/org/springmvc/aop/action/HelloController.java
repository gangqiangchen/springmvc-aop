package org.springmvc.aop.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springmvc.aop.service.UserService;

@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/hello.html")
    public String hello() {
        userService.save();
        return "ok";
    }

    @ResponseBody
    @RequestMapping("/index.html")
    public String index() {
        return "ok";
    }

}
