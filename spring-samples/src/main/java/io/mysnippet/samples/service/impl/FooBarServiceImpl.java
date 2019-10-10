package io.mysnippet.samples.service.impl;

import io.mysnippet.samples.service.BarService;
import io.mysnippet.samples.service.FooBarService;
import io.mysnippet.samples.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Service
public class FooBarServiceImpl implements FooBarService {

  @Autowired private FooService fooService;

  @Autowired private BarService barService;

  @Override
  public String foobar() {
    return String.format("%s%s", fooService.foo(), barService.bar());
  }
}
