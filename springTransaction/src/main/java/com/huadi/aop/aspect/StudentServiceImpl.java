package com.huadi.aop.aspect;

/**
 * @author wuzhiguo
 * @date 2020/9/1
 */
public class StudentServiceImpl implements StudentService{
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addUser(User user) {
        studentDao.add(user);
    }
}
