package com.example.proxyTest;

import com.example.dao.UserDao;
import com.example.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class ProxyInvocationHandler implements InvocationHandler {
    private Object userDao;

    public ProxyInvocationHandler(Object userDao) {
        this.userDao = userDao;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("a")) {
            System.out.println("proxy begin...");
        }
        Object invoke = method.invoke(userDao, args);
        System.out.println("proxy after...");
        return invoke;
    }
}

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = new Class[]{UserDao.class};
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) Proxy
                .newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new ProxyInvocationHandler(userDao));
        int add = userDao1.add(1, 2);
        int subtraction = userDao1.subtraction(1, 2);
        System.out.println(add);
        System.out.println(subtraction);
    }
}