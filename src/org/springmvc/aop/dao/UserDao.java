package org.springmvc.aop.dao;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springmvc.aop.model.User;

@Repository
public class UserDao {

    @Autowired
    public SessionFactory sessionFactory;

    public void save() {
        Session session = sessionFactory.getCurrentSession();
        long currentTimeMillis = System.currentTimeMillis();
        User user = new User();
        user.setName("name");
        user.setNickname("nickname");
        user.setTimelong(currentTimeMillis);
        user.setId(UUID.randomUUID().toString());
        Serializable save = session.save(user);
        System.out.println(save);
    }
}
