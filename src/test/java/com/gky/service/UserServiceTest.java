package com.gky.service;

import com.gky.domain.User;
import com.gky.exception.*;
import com.gky.service.impl.UserServiceImpl;
import com.gky.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceTest extends BaseTest {
    @Autowired
    private UserServiceImpl userService;
    //此处直接使用UserService的实现类，主要是方便抛出异常，然后异常出现时候可以针对性的处理

    @Test
    public void testAdd() {
        User user = new User();
//        user.setName("name");
        user.setPwd("666");
        user.setAge(9);
        user.setSex("男");
        user.setDuty("55");
        user.setLoginId("32");
        user.setCellNumber("552");
        try {
            userService.add(user);
        } catch (UserCanNotBeNullException e) {
            e.printStackTrace();
        } catch (UserNameCanNotBeNullException e) {
            e.printStackTrace();
        } catch (UserPwdCanNotBeNullException e) {
            e.printStackTrace();
        } catch (OtherThingsException e) {
            e.printStackTrace();
        } catch (UserAireadyExistException e) {
            e.printStackTrace();
        }
    }

    //···省略的其他测试代码···
}