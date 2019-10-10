package io.mysnippet.samples.javacfg.service.impl;

import io.mysnippet.samples.javacfg.service.BarService;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
public class BarServiceImpl implements BarService {

  @Override
  public String bar() {
    return "bar";
  }
}
