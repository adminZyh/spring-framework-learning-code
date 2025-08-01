package com.linkedbear.spring.my_test.module_quickstart.config;

import com.linkedbear.spring.my_test.module_quickstart.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BartenderConfiguration {

  @Bean
  public Bartender zhangsan() {
    return new Bartender("zhangsan");
  }

  @Bean
  public Bartender lisi() {
    return new Bartender("lisi");
  }


}
