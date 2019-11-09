package com.gky.dao;

import com.gky.domain.User;

import java.io.Serializable;
import java.util.List;

public interface UserDao extends Dao<User> {
    User findOneById(Serializable Id);

    List<User> findAll();
}
