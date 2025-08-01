package com.linkedbear.spring.my_test.conditional_usage;

import com.linkedbear.spring.configuration.c_conditional.config.TavernConfiguration;
import com.linkedbear.spring.my_test.conditional_usage.config.BarConfig;
import java.util.stream.Stream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.my_test.conditional_usage");
    Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
  }
}
