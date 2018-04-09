package com.zyc.demo.dao;

import com.zyc.demo.domain.User1;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/4/9.
 */
public interface User1Repository extends JpaRepository<User1,Long> {

    User1 findByUserName(String userName);
    User1 findByUserNameOrEmail(String username, String email);
}
