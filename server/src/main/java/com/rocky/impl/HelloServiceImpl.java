package com.rocky.impl;

import com.rocky.rpc.interfaces.HelloService;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/5/17 20:32
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name + "......";
    }
}
