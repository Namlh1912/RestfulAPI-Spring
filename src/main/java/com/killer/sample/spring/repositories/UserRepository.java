package com.killer.sample.spring.repositories;

import com.killer.sample.spring.configuration.JpaConfiguration;
import com.killer.sample.spring.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by app on 4/16/17.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}
