package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * @author lrf
 */

@Aspect
@Component
public class AuthAspect {
    
    private static final Logger log = LoggerFactory.getLogger(AuthAspect.class);
    
    @Pointcut("@annotation(com.example.annotation.Auth)")
    public void authCut() {}
    
    /**
     * 环绕通知
     */
    @Around("authCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        String simpleName = signature.getDeclaringType().getSimpleName();
        String methodName = signature.getMethod().getName();
        long start = System.currentTimeMillis();
        Object proceed = point.proceed();
        long end = System.currentTimeMillis();
        log.info("方法名 {}.{} 执行耗时 {} ms", simpleName, methodName, (end - start));
        return proceed;
    }
}
