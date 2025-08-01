package com.linkedbear.spring.my_test.module_quickstart;

import com.linkedbear.spring.my_test.module_quickstart.config.BarConfig;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    return new String[]{Bar.class.getName(), BarConfig.class.getName()};
  }
}
