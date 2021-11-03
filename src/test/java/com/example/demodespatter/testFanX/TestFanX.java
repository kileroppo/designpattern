package com.example.demodespatter.testFanX;

import com.example.demodespatter.testFanX.impl.Cat;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: TODO
 * @author: lizp
 * @date: 2021年10月09日 14:29
 */
@Slf4j
@SpringBootTest
//@RunWith(SpringRunner.class)
public class TestFanX {

    static int printItem(List<? extends Animal> list) {
        int retVal =0;
        for (Animal itemAniml : list){
            retVal += list.size();
        }
        return retVal;
    }

    static int printItem1 (List< Animal > animals ){
        int retVal = 0;
        for ( Animal animal : animals )
        {
            retVal +=  animals.size();
        }
        return retVal;
    }

    /**
     * 通配符限制k e 的类型
     * @param args1
     * @param args2
     * @param <K>
     * @param <E>
     * @return
     */
    private <K extends  String, E extends Integer> E test(K args1, E args2){


        return args2;
    }

    /**
     * 测试使用乏型 可以省略转换
     */
    @Test
    public void testFanX () {

        Cat<String> objectCat = new Cat<>();
        objectCat.setT("ddddd");
        // 不用乏型  需要类型转换
        String tdd = objectCat.getT();
        System.out.println("tdd:" + tdd);

        // 使用乏型
        Cat<List> listCat = new Cat<>();
        listCat.setT(Collections.singletonList("5555,43434"));
        List td = listCat.getT();
        td.parallelStream().forEach(System.out::println);
    }

    /**
     * 测试使用乏型 父类能不能调用自雷的方法
     */
    @Test
    public void testFanX2 () {

        List<Cat> objects = new ArrayList<>();

        printItem(objects);
            // 报错
//        printItem1(objects);



    }

    public void testFanX3 () {
        test("1", 2);
    }
}
