package io.mysnippet.samples.aop.test;

import io.mysnippet.samples.aop.config.AopConfig;
import io.mysnippet.samples.aop.config.FooBarConfig;
import io.mysnippet.samples.aop.service.FooBarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
public class Main {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigApplicationContext(AopConfig.class, FooBarConfig.class);

    for (String name : annotationConfigApplicationContext.getBeanDefinitionNames())
      System.out.println(name);

    // 注意传入FooBarServiceImpl.class会报错
    FooBarService fooBarService = annotationConfigApplicationContext.getBean(FooBarService.class);

    String result = fooBarService.foobar();
    System.out.println(result);

    annotationConfigApplicationContext.close();
  }
}
