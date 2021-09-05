package com.example.demodespatter;

import com.example.demodespatter.designpattern.factory.simplefactdemo.store.FirstBorthel;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.SecondBorthel;
import com.example.demodespatter.designpattern.factory.simplefactdemo.women.WhoreFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.constant.WSytleConstantdd;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.abs.AbsWhore;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatterTests {

    WhoreFactory whoreFactory = new WhoreFactory();

    FirstBorthel borth = new FirstBorthel(whoreFactory);
    
    SecondBorthel secBorth = new SecondBorthel();

    @Test
    @Ignore
    void testFirtstBorthel() {
        borth.makeOrder(WSytleConstantdd.BIG_tits.getStyle());
        borth.startService();
    }

    @Test
    void testSecondBorthel(){
        AbsWhore big_tits = secBorth.orderWhore("big tits");
        
    }
}
