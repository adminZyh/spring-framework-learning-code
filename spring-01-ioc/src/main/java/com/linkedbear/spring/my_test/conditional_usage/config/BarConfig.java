package com.linkedbear.spring.my_test.conditional_usage.config;

import com.linkedbear.spring.my_test.conditional_usage.Bar;
import com.linkedbear.spring.my_test.conditional_usage.ConditionalOnBean;
import com.linkedbear.spring.my_test.conditional_usage.ExistBossCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfig {

//  @Bean
//  @Conditional(ExistBossCondition.class)
//  public Bar bar() {
//    return new Bar();
//  }

  @Bean
  @ConditionalOnBean(beanNames = "boss")
  public Bar bar() {
    return new Bar();
  }

}
