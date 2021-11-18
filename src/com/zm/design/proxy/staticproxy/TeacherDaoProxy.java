package com.zm.design.proxy.staticproxy;

public class TeacherDaoProxy implements IteacherDao {
    private IteacherDao iteacherDao = new TeacherDao();

    @Override
    public void teach() {
        System.out.println("一个静态代理的小例子");
        System.out.println("教学之前做一个准备工作-----------------");
        iteacherDao.teach();
        System.out.println("教学之后做一个总结工作-----------------");
    }

}
