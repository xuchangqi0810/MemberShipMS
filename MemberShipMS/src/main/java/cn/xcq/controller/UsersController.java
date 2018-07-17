package cn.xcq.controller;

import cn.xcq.entity.Users;
import cn.xcq.service.IUsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator
 * User:xcq
 * Date:2018/7/17
 * Time:13:59
 */
@Controller
public class UsersController {
    //注入Service
    @Resource(name = "usersService")
    private IUsersService usersService;

    //01.登录
    @RequestMapping("/login")
    @ResponseBody
    public Object login(String name, String password, HttpSession session){
        Users login = usersService.login(name, password);
        //判断Users对象是否为空
        if (login!=null&&login.getName()!=null){
            session.setAttribute("users",login);
            return login;
        }
        return null;
    }

    //02.
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    //03.注销
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.removeAttribute("users");
        return "index";
    }
}
