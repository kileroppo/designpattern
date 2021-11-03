package com.example.demodespatter.test1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年09月29日 17:37
 */
@Slf4j
@SpringBootTest
public class TestPerson2Props {


    @Test
    public void testProperties(){
        Person2 person = new Person2();
        person.setName("人体存在 有人");
        String name = person.getName();
        String name2 = "有人";
        if (name.contains("有人")) {
            person.setName("有人");
        }
        System.out.println("name:" + name);
        System.out.println(person.getName().contains(name2));
    }
}
