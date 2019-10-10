package io.mysnippet.samples.javacfg.service.impl;

import io.mysnippet.samples.javacfg.service.BarService;
import io.mysnippet.samples.javacfg.service.FooBarService;
import io.mysnippet.samples.javacfg.service.FooService;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
public class FooBarServiceImpl implements FooBarService {

  private FooService fooService;

  private BarService barService;

  public void setFooService(FooService fooService) {
    this.fooService = fooService;
  }

  public void setBarService(BarService barService) {
    this.barService = barService;
  }

  @Override
  public String foobar() {
    return String.format("%s%s", fooService.foo(), barService.bar());
  }
}
