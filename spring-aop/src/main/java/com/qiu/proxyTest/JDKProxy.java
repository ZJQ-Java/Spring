package com.qiu.proxyTest;

import com.qiu.dao.UserDao;
import com.qiu.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public ProxyInvocationHandler(Object userDao) {
        this.target = userDao;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("a")) {
            System.out.println("proxy begin...");
        }
        Object invoke = method.invoke(target, args);
        System.out.println("proxy after...");
        return invoke;
    }
}

public class JDKProxy {
    public static void main(String[] args) {
        /*Class[] interfaces = new Class[]{UserDao.class};
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) Proxy
                .newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new ProxyInvocationHandler(userDao));
        int add = userDao1.add(1, 2);
        int subtraction = userDao1.subtraction(1, 2);
        System.out.println(add);
        System.out.println(subtraction);*/
        ProxyInvocationHandler proxy = new ProxyInvocationHandler(new UserDaoImpl());
        UserDao user = (UserDao)proxy.getProxy();
        int add = user.add(1, 2);
        System.out.println(add);
    }
}
