package io.mysnippet.samples.ioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangyongtao
 * @date 2019-10-10
 */
@Configuration
@ComponentScan("io.mysnippet.samples.ioc.service")
public class FooBarConfig {}
