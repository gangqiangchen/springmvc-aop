package org.springmvc.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springmvc.aop.dao.UserDao;

@Service
public class UserService {

    @Autowired
    UserDao dao;

    public void save() {
        dao.save();
    }
}
