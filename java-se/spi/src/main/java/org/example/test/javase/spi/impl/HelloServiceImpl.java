package org.example.test.javase.spi.impl;

import org.example.test.javase.spi.api.HelloService;

/**
 * @author guitongZhang
 * @date 2021/03/14 18:57
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
