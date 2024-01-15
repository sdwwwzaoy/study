package org.example.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.Md5CredentialsMatcher;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;

public class ShiroRun {
    public static void main(String[] args) {

        //1.get security manager
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        //2.get subject
        Subject subject = SecurityUtils.getSubject();

        //3.create token
        AuthenticationToken token = new UsernamePasswordToken("zhangsan", "z3");

        //4.login
        subject.login(token);
        System.out.println("登录成功");
        System.out.println(subject.hasRole("role3"));
        System.out.println(subject.isPermitted("user::insert"));

    }

}
