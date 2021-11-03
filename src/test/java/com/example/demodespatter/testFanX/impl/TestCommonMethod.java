package com.example.demodespatter.testFanX.impl;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年10月08日 17:21
 */
@Slf4j
@SpringBootTest
public class TestCommonMethod {

    @Test
    public void testStrSplit(){
        String  testStr = "presence_state:none:";
        String[] boundSli = testStr.split(":");
        if(boundSli.length != 2 && boundSli.length != 3){
          System.out.println("dddddd");
        }
    }
}
