package com.linkedbear.spring.my_test.profile_application;

import com.linkedbear.spring.my_test.module_quickstart.config.BartenderConfiguration;
import java.util.stream.Stream;
import javax.sql.DataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
    applicationContext.getEnvironment().setActiveProfiles("dev");
    applicationContext.register(DataSourceConfiguration.class);
    applicationContext.refresh();

    Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
  }
}
