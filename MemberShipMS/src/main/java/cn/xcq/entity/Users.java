package cn.xcq.entity;

import java.util.Date;

/**
 * Created by Administrator
 * User:xcq
 * Date:2018/7/17
 * Time:13:35
 */
public class Users {
    private Integer id;
    private String name;
    private String password;
    private Integer status;
    private Date last_modify_time;
    private User_type user_type;
    private Integer type_id;

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLast_modify_time() {
        return last_modify_time;
    }

    public void setLast_modify_time(Date last_modify_time) {
        this.last_modify_time = last_modify_time;
    }

    public User_type getUser_type() {
        return user_type;
    }

    public void setUser_type(User_type user_type) {
        this.user_type = user_type;
    }
}
