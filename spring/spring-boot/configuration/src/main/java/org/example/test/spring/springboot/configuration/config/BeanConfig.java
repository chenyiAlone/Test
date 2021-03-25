package org.example.test.spring.springboot.configuration.config;

import lombok.extern.slf4j.Slf4j;
import org.example.test.spring.springboot.configuration.component.BeanOutside;
import org.example.test.spring.springboot.configuration.component.BeanInner;
import org.example.test.spring.springboot.configuration.component.condition.BeanConditionFalse;
import org.example.test.spring.springboot.configuration.component.condition.BeanConditionTrue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guitongZhang
 * @date 2021/03/24 20:20
 */
@Slf4j
@Configuration
public class BeanConfig {

    @Value("${value}")
    private String value;


    @Bean
    public BeanOutside bean1() {
        log.info("value: {}", value);
        return new BeanOutside();
    }


    @Configuration
    public static class InnerConfig {

        @Bean
        public BeanInner bean2() {
            return new BeanInner();
        }

    }

    @Configuration
    @ConditionalOnProperty(value = "condition", havingValue = "true")
    public static class InnerConfigCondition {

        @Bean
        public BeanConditionTrue beanConditionTrue() {
            return new BeanConditionTrue();
        }

    }

    @Configuration
    @ConditionalOnProperty(value = "condition", havingValue = "false")
    public static class InnerConfigConditionFalse {

        @Bean
        public BeanConditionFalse beanConditionFalse() {
            return new BeanConditionFalse();
        }

    }


}
