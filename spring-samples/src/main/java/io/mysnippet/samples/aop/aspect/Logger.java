package io.mysnippet.samples.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class Logger {

  @Pointcut("execution (* io.mysnippet.samples.aop.service.*.*(..))")
  private void pointcut() {}

  @Before("pointcut()")
  public void before(JoinPoint joinPoint) {

    // 得到拦截的实体类
    Object target = joinPoint.getTarget();
    Class clazz = target.getClass();

    // 得到拦截的方法
    Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();

    System.out.println(
        String.format("Go to method %s of class %s", method.getName(), clazz.getName()));
  }
}
