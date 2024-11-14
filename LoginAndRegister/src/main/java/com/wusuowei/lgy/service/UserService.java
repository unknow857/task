package com.wusuowei.lgy.service;

import com.wusuowei.lgy.model.po.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LGY
 * @since 2023-03-09
 */
public interface UserService extends IService<User> {

    User getByNameAndPassword(String name,String password);

    User getByName(String name);

    void addUser(User user);
}
