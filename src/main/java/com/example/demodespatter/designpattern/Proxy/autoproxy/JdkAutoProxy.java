package com.example.demodespatter.designpattern.Proxy.autoproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年11月03日 11:13
 */
@Slf4j
public class JdkAutoProxy implements InvocationHandler {

  private Object subject;

  public JdkAutoProxy(Object subject) {
    this.subject = subject;
    }




//    public Object getProxy(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
//    return  Proxy.newProxyInstance( loader, interfaces,  h );
//    }
    public Object getProxy(Object obj) {
    return Proxy.newProxyInstance(
        obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
        (proxy, method, args) -> { System.out.println("fasdfasdfasdfd");
          return method.invoke(obj, args);
        });
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(subject, args);
    }


}

