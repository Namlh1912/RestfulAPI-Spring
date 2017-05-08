package com.killer.sample.spring.service;

import com.killer.sample.spring.model.User;

import java.util.List;

/**
 * Created by app on 4/16/17.
 */
public interface UserService {

    User findById(Long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}
