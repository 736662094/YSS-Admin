package com.wjl.admin.service.impl;

import com.wjl.admin.advice.CustomException;
import com.wjl.admin.entity.User;
import com.wjl.admin.enums.ResponseEnum;
import com.wjl.admin.mapper.UserMapper;
import com.wjl.admin.service.UserServiceI;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User.
 *
 * @author 736662094
 */

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserServiceI {

    @Autowired
    private UserMapper userMapper;
}
