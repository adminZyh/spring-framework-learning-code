package com.linkedbear.spring.my_test.profile_quickstart;

import com.linkedbear.spring.my_test.profile_quickstart.config.BartenderConfiguration;
import java.util.stream.Stream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    applicationContext.getEnvironment().setActiveProfiles("city");
    applicationContext.register(BartenderConfiguration.class);
    applicationContext.refresh();
    Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

  }
}
