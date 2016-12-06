package org.springmvc.aop.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springmvc.aop.model.User;
import org.springmvc.aop.service.UserService;

public class DaoTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();
    }

    // 手动开启事务保存
    public void save() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        long currentTimeMillis = System.currentTimeMillis();
        User user = new User();
        user.setName("name");
        user.setNickname("nickname");
        user.setTimelong(currentTimeMillis);
        user.setId("key_user_1");
        Serializable save = session.save(user);
        System.out.println(save);
        // int a = 1 / (1 - 1); //测试事务回滚
        transaction.commit();
        session.close();
    }
}
