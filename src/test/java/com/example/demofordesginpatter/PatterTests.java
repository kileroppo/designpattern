package com.example.demofordesginpatter;

import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.store.FirstBorthel;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.WhoreFactory;
import com.example.demofordesginpatter.designPattern.factory.simplefactDemo.constant.WSytleConstantdd;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatterTests {

    WhoreFactory whoreFactory = new WhoreFactory();

    FirstBorthel borth = new FirstBorthel(whoreFactory);

    @Test
    void contextLoads() {
        borth.makeOrder(WSytleConstantdd.BIG_tits.getStyle());
        borth.startService();
    }

}
