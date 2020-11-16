package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserProxy {
    /**
     * execution([权限修饰符 可省略] [返回类型] [类全路径] [方法名称]([参数列表])  )
     */
    @Pointcut(value = "execution(* com.example.dao.*.*(..))")
    void pointDemo(){
    }
   /* @Before("execution(* com.example.dao.*.*(..))")
//    @Pointcut("pointDemo()")
    public void before(){
        System.out.println("before");
    }


    @After("execution(* com.example.dao.*.*(..))")
//    @Pointcut("pointDemo()")
    public void after(){
        System.out.println("after");
    }*/

    @Around("execution(* com.example.dao.*.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around begin");
        Object proceed = point.proceed();
        System.out.println("around end");
        return proceed;
    }


}
