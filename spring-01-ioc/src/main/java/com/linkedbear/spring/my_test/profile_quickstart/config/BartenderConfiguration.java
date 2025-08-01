package com.linkedbear.spring.my_test.profile_quickstart.config;

import com.linkedbear.spring.my_test.profile_quickstart.component.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
public class BartenderConfiguration {
  @Bean
  public Bartender zhangsan() {
    return new Bartender("zhansan");
  }

  @Bean
  public  Bartender lisi() {
    return new Bartender("lisi");
  }
}
