package org.example.test;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

public class MyRealm extends AuthorizingRealm {

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.get identity
        String principal = token.getPrincipal().toString();

        //2.get auth
        String pwd = new String((char[]) token.getCredentials());
        System.out.println(principal + "---" + pwd);

        //3.get user from cache
        if (principal.equals("zhangsan")) {
            //3.1
            String pwdInfo = "7174f64b13022acd3c56e2781e098a5f";
            return new SimpleAuthenticationInfo(token.getPrincipal(), pwdInfo, ByteSource.Util.bytes("salt"), principal);
        }
        //4.create auth info
        return null;
    }

}
