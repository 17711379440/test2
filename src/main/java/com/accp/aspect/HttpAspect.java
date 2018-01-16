package com.accp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/15 17:56
 * @Version: 1.0
 */
@Aspect
@Component
public class HttpAspect {
    private final static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(HttpAspect.class);

    //定义切入点
    @Pointcut("execution(* com.accp.service..*(..))")
    public void log(){

    }
    //在log之前执行
    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request   = attributes.getRequest();

        //url
        LOGGER.info("url={}",request.getRequestURI());

        //type
        LOGGER.info("method={}",request.getMethod());

        //ip
        LOGGER.info("ip={}",request.getRemoteAddr());

        //method
      /*
            oinPoint.getSignature().getDeclaringTypeName() 请求类的路径
            joinPoint.getSignature().getName() 请求方法
        */
        LOGGER.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        //param
        LOGGER.info("param={}",joinPoint.getArgs());
    }
    @After("log()")
    public  void doAfter(){

    }

    /**
     * 获取请求=的参数
     * @param obj
     */
/*    @AfterReturning(returning = "obj",pointcut = "log()")
    public void doAfterReturning(Object obj){
        LOGGER.info("response={}",obj);
    }*/


}
