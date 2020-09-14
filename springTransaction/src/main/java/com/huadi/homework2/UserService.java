package com.huadi.homework2;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public interface UserService {
    public void addUser(String name,String password);
    public void deleteUser();
    public void updateUser();
    public void selectUser();
}
