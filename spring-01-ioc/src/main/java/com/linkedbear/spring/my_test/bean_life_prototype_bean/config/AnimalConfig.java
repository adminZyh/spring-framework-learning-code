package com.linkedbear.spring.my_test.bean_life_prototype_bean.config;

import com.linkedbear.spring.my_test.bean_life_prototype_bean.Animal;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnimalConfig {

  @Bean
  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public Animal animal() {
    return new Animal();
  }

}
