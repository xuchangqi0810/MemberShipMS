package cn.xcq.service;

import cn.xcq.entity.Users;

/**
 * Created by Administrator
 * User:xcq
 * Date:2018/7/17
 * Time:13:38
 */
public interface IUsersService {
    //01.登录
    public Users login(String name, String password);
}
