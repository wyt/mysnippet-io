package io.mysnippet.samples.javacfg.config;

import io.mysnippet.samples.javacfg.service.BarService;
import io.mysnippet.samples.javacfg.service.FooBarService;
import io.mysnippet.samples.javacfg.service.FooService;
import io.mysnippet.samples.javacfg.service.impl.BarServiceImpl;
import io.mysnippet.samples.javacfg.service.impl.FooBarServiceImpl;
import io.mysnippet.samples.javacfg.service.impl.FooServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Configuration
public class FooBarConfig {

  @Bean
  public FooService fooService() {
    return new FooServiceImpl();
  }

  @Bean
  public BarService barService() {
    return new BarServiceImpl();
  }

  @Bean
  public FooBarService fooBarService() {
    FooBarServiceImpl fooBarService = new FooBarServiceImpl();
    fooBarService.setFooService(fooService());
    fooBarService.setBarService(barService());
    return fooBarService;
  }

  // 也可以用带有参数的方法声明fooBarService Bean
  public FooBarService fooBarService(FooService fooService, BarService barService) {
    FooBarServiceImpl fooBarService = new FooBarServiceImpl();
    fooBarService.setFooService(fooService);
    fooBarService.setBarService(barService);
    return fooBarService;
  }
}
