package io.mysnippet.samples.conditional.config;

import io.mysnippet.samples.conditional.cond.LinuxCondition;
import io.mysnippet.samples.conditional.cond.WindowsCondition;
import io.mysnippet.samples.conditional.service.Shell;
import io.mysnippet.samples.conditional.service.impl.LinuxShellImpl;
import io.mysnippet.samples.conditional.service.impl.WindowsShellImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

  @Bean
  @Conditional(LinuxCondition.class)
  public Shell linuxShell() {
    return new LinuxShellImpl();
  }

  @Bean
  @Conditional(WindowsCondition.class)
  public Shell windowsShell() {
    return new WindowsShellImpl();
  }
}
