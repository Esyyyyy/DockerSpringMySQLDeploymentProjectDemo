package com.lagou.dockerdemo.service;

import com.lagou.dockerdemo.entity.Tbuser;

import java.util.List;

public interface UserService {

    List<Tbuser> queryUsers();

    Tbuser login(Tbuser user);
    Tbuser queryUserByid(Integer userid);
}
