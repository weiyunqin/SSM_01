package com.gky.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mvc")
public class MainController {
/**
 * 在类上面的 @RequestMapping("/mvc") ，是说明这个类的访问地址是 /mvc 。
 *
 * 在方法上面的 @RequestMapping(value = "/login",method = RequestMethod.GET) ，是说明我这个方法的访问地址是 /mvc/login ，请求方式是http请求的get方式。
 *
 * 这里我的方法是String方法，则是直接返回一个web页面的名字。
 *
 * 当然，我们并不需要说直接去设定某个jsp文件。我们需要的是在这里指定好名称，然后使用对应的自动完成就能创建出那个jsp文件。
 *
 * 然后我们直接在jsp文件中填写对应的代码就行了。
 */

    /**
     * 登陆页面
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "login";
    }

}
