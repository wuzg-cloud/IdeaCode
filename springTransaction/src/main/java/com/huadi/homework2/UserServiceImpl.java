package com.huadi.homework2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class UserServiceImpl extends JdbcDaoSupport implements UserService{
    public void addUser(String name, String password) {
        String sql = "insert into user (name,password) values (?,?)";
        this.getJdbcTemplate().update(sql,name,password);
    }

    public void deleteUser() {

    }

    public void updateUser() {

    }

    public void selectUser() {

    }
}
