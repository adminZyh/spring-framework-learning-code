package com.linkedbear.spring.my_test.conditional_usage;

import java.util.Map;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OnBeanCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    //类型匹配
    Map<String, Object> attributes = metadata.getAnnotationAttributes(
        ConditionalOnBean.class.getName());
    Class<?>[] classes = (Class<?>[]) attributes.get("value");
    for (Class<?> clazz : classes) {
      if (!context.getBeanFactory().containsBeanDefinition(clazz.getName())) {
        return false;
      }
    }
    //名称匹配
    String[] beanNames = (String[]) attributes.get("beanNames");
    // 逐个校验IOC容器中是否包含传入的bean名称
    for (String beanName : beanNames) {
      if (!context.getBeanFactory().containsBeanDefinition(beanName)) {
        return false;
      }
    }
    return true;
  }
}
