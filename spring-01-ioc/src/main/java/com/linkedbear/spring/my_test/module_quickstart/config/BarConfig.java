package com.linkedbear.spring.my_test.module_quickstart.config;

import com.linkedbear.spring.my_test.module_quickstart.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfig {
  @Bean
  public Bar bbar() {
    return new Bar();
  }
}
