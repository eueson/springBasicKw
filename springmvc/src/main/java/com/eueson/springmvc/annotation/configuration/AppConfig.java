package com.eueson.springmvc.annotation.configuration;

import com.eueson.springmvc.annotation.configuration.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该配置类等同于
 * <beans>
 *     <bean id = "user" class="com.eueson.springmvc.annotation.configuration.User"/>
 * </beans>
 * */
@Configuration(proxyBeanMethods=true)
public class AppConfig {

    @Bean
    public User getUser() {
        return new User("Mahesh");
    }
}


