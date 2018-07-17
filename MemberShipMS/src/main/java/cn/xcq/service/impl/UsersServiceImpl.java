package cn.xcq.service.impl;

import cn.xcq.dao.IUsersDAO;
import cn.xcq.entity.Users;
import cn.xcq.service.IUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator
 * User:xcq
 * Date:2018/7/17
 * Time:13:48
 */
@Service("usersService")
public class UsersServiceImpl implements IUsersService {
    @Resource(name = "IUsersDAO")
    private IUsersDAO usersDAO;

    @Override
    public Users login(String name, String password) {
        return usersDAO.login(name,password);
    }


    public IUsersDAO getUsersDAO() {
        return usersDAO;
    }

    public void setUsersDAO(IUsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }
}
