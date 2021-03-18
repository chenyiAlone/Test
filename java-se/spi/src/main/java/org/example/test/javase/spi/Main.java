package org.example.test.javase.spi;

import java.util.ServiceLoader;
import lombok.extern.slf4j.Slf4j;
import org.example.test.javase.spi.api.HelloService;

/**
 * @author guitongZhang
 * @date 2021/03/14 18:50
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        ServiceLoader<HelloService> services = ServiceLoader.load(HelloService.class);
        for (HelloService service : services) {
            service.sayHello();
        }
        log.info("yes");
    }

}
