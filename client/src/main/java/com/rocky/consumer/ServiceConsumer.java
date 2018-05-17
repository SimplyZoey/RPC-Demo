package com.rocky.consumer;

import com.rocky.client.CallService;
import com.rocky.rpc.interfaces.HelloService;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/5/17 20:35
 */
public class ServiceConsumer {

    public static void main(String[] args) throws Exception {
        HelloService service = CallService.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            String hello = service.hello("World" + i);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }
}
