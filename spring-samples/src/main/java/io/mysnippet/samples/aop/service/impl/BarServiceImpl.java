package io.mysnippet.samples.aop.service.impl;

import io.mysnippet.samples.aop.service.BarService;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Service("barServiceImpl")
public class BarServiceImpl implements BarService {

  @Override
  public String bar() {
    return "bar";
  }
}
