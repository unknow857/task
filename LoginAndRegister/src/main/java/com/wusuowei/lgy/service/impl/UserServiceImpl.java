package com.wusuowei.lgy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wusuowei.lgy.mapper.UserMapper;
import com.wusuowei.lgy.model.po.User;
import com.wusuowei.lgy.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lgy
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getByNameAndPassword(String name,String password) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getPassword,password);
        wrapper.eq(User::getUsername, name);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public User getByName(String name) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>();
        wrapper.eq(User::getUsername, name);
        return userMapper.selectOne(wrapper);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }
}
