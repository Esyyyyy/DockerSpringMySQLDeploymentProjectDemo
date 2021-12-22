package com.lagou.dockerdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lagou.dockerdemo.entity.Tbuser;
import com.lagou.dockerdemo.mapper.UserMapper;
import com.lagou.dockerdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<Tbuser> queryUsers() {
        return this.userMapper.selectList(null);
    }

    @Override
    public Tbuser login(Tbuser user) {
        QueryWrapper<Tbuser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", user.getUsername()).eq("password", user.getPassword());
        Tbuser tbuser = this.userMapper.selectOne(wrapper);
        return tbuser;
    }

    @Override
    public Tbuser queryUserByid(Integer userid) {
        return this.userMapper.selectById(userid);
    }
}
