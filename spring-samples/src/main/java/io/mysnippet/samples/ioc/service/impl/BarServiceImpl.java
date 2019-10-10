package io.mysnippet.samples.ioc.service.impl;

import io.mysnippet.samples.ioc.service.BarService;
import org.springframework.stereotype.Service;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Service
public class BarServiceImpl implements BarService {

  @Override
  public String bar() {
    return "bar";
  }
}
