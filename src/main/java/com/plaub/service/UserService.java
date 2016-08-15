package com.plaub.service;

import com.plaub.domain.User;
import com.plaub.domain.UserCreateForm;

import java.util.List;

/**
 * Created by ekaterina on 10.08.2016.
 */
public interface UserService {
    User getUserById(long id);

    User getUserByLogin(String login);

    List<User> getAllUsers();

    User create(UserCreateForm form);

    User save(User user);

    void delete(User user);

}
