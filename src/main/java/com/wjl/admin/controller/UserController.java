package com.wjl.admin.controller;

import com.wjl.admin.entity.User;
import com.wjl.admin.service.UserServiceI;

import com.wjl.admin.utils.ResultUtil;
import com.wjl.admin.vo.RespVo;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User.
 *
 * @author 736662094
 */

@Controller
@Slf4j
@RequestMapping("user")
public class UserController extends BaseController<User> {
    @Autowired
    UserServiceI userService;

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("login")
    public RespVo login(User entity) {
        return ResultUtil.success(entity);
    }

    @Override
    @GetMapping("page-list")
    @ResponseBody
    public RespVo pageList(User entity) {
        return super.pageList(entity);
    }

    @Override
    @GetMapping("get-one")
    @ResponseBody
    public RespVo getOne(Integer id) {
        return super.getOne(id);
    }

    @Override
    @PostMapping("add-one")
    @ResponseBody
    public RespVo addOne(User entity) {
        return super.addOne(entity);
    }

    @Override
    @PostMapping("add")
    @ResponseBody
    public RespVo add(List<User> list) {
        return super.add(list);
    }

    @Override
    @PostMapping("del")
    @ResponseBody
    public RespVo del(User entity) {
        return super.del(entity);
    }

    @Override
    @PostMapping("edit")
    @ResponseBody
    public RespVo edit(User entity) {
        return super.edit(entity);
    }
}