package com.linkedbear.spring.my_test.bean_life_single_bean.config;

import com.linkedbear.spring.my_test.bean_life_single_bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean
  public Person person() {
    return new Person();
  }

}
