package org.example.test.spring.springboot.configuration.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author guitongZhang
 * @date 2021/03/24 20:21
 */
@Slf4j
public class BeanOutside implements InitializingBean {

    @Value("${value}")
    private String value;

    @Override
    public void afterPropertiesSet() {
        log.info("value: {}", value);
    }
}
