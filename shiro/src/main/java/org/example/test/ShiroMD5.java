package org.example.test;

import org.apache.shiro.crypto.hash.Md5Hash;

public class ShiroMD5 {

    public static void main(String[] args) {
        String pwd = "z3";
        long start = System.currentTimeMillis();
        Md5Hash md5Hash = new Md5Hash(pwd + "salt");
        long mid = System.currentTimeMillis();
        System.out.println(mid - start);

        start = System.currentTimeMillis();
        Md5Hash md5Hash2 = new Md5Hash(pwd, "salt", 3);
        mid = System.currentTimeMillis();

        System.out.println(md5Hash2);


    }
}
