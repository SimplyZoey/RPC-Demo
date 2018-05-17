package com.rocky.provider;

import com.rocky.impl.HelloServiceImpl;
import com.rocky.rpc.interfaces.HelloService;
import com.rocky.server.PublishService;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/5/17 20:33
 */
public class ServiceProvider {

    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        PublishService.publish(service, 1234);
    }
}
