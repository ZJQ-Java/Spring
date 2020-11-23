package com.qiu.aop;

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
     * execution(* com.sample.service.impl..*.*(..))
     * 第一个”*“符号	表示返回值的类型任意；
     * com.sample.service.impl	AOP所切的服务的包名，即，我们的业务部分
     * 包名后面的”..“	表示当前包及子包
     * 第二个”*“	表示类名，*即所有类。此处可以自定义，下文有举例
     * .*(..)	表示任何方法名，括号表示参数，两个点表示任何参数类型
     */
    @Pointcut(value = "execution(* com.qiu.dao..*.*(..))")
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

    @Around("execution(* com.qiu.dao.*.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around begin");
        Object proceed = point.proceed();
        System.out.println("around end");
        return proceed;
    }


}
