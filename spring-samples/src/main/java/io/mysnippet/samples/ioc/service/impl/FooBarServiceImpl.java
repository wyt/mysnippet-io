package io.mysnippet.samples.ioc.service.impl;

import io.mysnippet.samples.ioc.service.BarService;
import io.mysnippet.samples.ioc.service.FooBarService;
import io.mysnippet.samples.ioc.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Service("fooBarService")
@DependsOn(value = {"barService"})
public class FooBarServiceImpl implements FooBarService {

  @Autowired private FooService fooService;

  @Autowired private BarService barService;

  @Override
  public String foobar() {
    return String.format("%s%s", fooService.foo(), barService.bar());
  }
}
