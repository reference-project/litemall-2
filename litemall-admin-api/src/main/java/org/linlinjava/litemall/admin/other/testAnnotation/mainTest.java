package org.linlinjava.litemall.admin.other.testAnnotation;

import java.lang.reflect.InvocationTargetException;


/**
 * @author lijiongfei
 * @Title: mainTest
 * @ProjectName litemall
 * @Description: TODO
 * @date 2019/1/1617:26
 */
public class mainTest {
    public static void main(String[] args) throws IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        User user = UserFactory.create();
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}