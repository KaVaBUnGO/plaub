package com.plaub.repository;

import com.plaub.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ekaterina on 10.08.2016.
 */
public interface UserRepository extends CrudRepository<User, Long>{
    User findByLogin(String login);

    User findById(Long id);
}
