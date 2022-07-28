package com.eshop.bootstore.dao;

import com.eshop.bootstore.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findFirstByName(String name);
}
