package com.eshop.bootstore.service;

import com.eshop.bootstore.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {  //security
    boolean save(UserDTO userDTO);
}
