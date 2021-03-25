package org.example.test.spring.springboot.configuration.config;

import lombok.extern.slf4j.Slf4j;
import org.example.test.spring.springboot.configuration.component.Bean1;
import org.example.test.spring.springboot.configuration.component.BeanInner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guitongZhang
 * @date 2021/03/25 11:30
 */
@Slf4j
@Configuration
public class Bean2Config {

    @Bean
    public Bean1 bean(BeanInner beanInner) {
        log.info("beanInner: {}", beanInner);
        return new Bean1();
    }

}
