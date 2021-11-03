package com.example.demodespatter;

import com.example.demodespatter.designpattern.Proxy.autoproxy.ISay;
import com.example.demodespatter.designpattern.Proxy.autoproxy.JdkAutoProxy;
import com.example.demodespatter.designpattern.Proxy.autoproxy.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年11月03日 11:41
 */
@Slf4j
@SpringBootTest
public class TestProxy {

    @Test
    public  void tedddd() {
        ISay person = new Person();
        JdkAutoProxy jdkAutoProxy = new JdkAutoProxy(person);
        // 这里要用父类的接口
//        ISay proxy = (ISay) jdkAutoProxy.getProxy(person.getClass().getClassLoader(),
//            person.getClass().getInterfaces(),jdkAutoProxy);

        ISay proxy = (ISay) jdkAutoProxy.getProxy(person);
        proxy.sayHello();
    }
}
