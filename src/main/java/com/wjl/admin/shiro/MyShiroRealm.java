package com.wjl.admin.shiro;

import com.wjl.admin.advice.CustomException;
import com.wjl.admin.entity.User;
import com.wjl.admin.enums.ResponseEnum;
import com.wjl.admin.service.UserServiceI;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 实现AuthorizingRealm接口用户用户认证.
 *
 * @author 736662094
 */
public class MyShiroRealm extends AuthorizingRealm {

    //用于用户查询
    @Autowired
    private UserServiceI loginService;

    //角色权限和对应权限添加
    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            throw new RuntimeException(ResponseEnum.USERNAME_PASSWORD_ERR.getMessage());
        }
        //获取用户信息
        String username = authenticationToken.getPrincipal().toString();
        if (StringUtils.isBlank(username)) {
            throw new CustomException(ResponseEnum.FORM_DATA_ERR.getMessage());
        }
        User user = new User();
        user.setUsername(username);
        User loginEntity = loginService.selectOne(user);
        if (loginEntity == null) {
            throw new RuntimeException(ResponseEnum.USERNAME_PASSWORD_ERR.getMessage());
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo
                    = new SimpleAuthenticationInfo(loginEntity, user.getPassword(), getName());
            return simpleAuthenticationInfo;
        }
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }
}