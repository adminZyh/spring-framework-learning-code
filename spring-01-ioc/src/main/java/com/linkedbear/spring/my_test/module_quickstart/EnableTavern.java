package com.linkedbear.spring.my_test.module_quickstart;

import com.linkedbear.spring.my_test.module_quickstart.config.BartenderConfiguration;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({Boss.class, BartenderConfiguration.class,BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {

}
