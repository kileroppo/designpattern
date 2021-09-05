package com.example.demodespatter;

import com.example.demodespatter.designpattern.factory.simplefactdemo.store.ThirdBorthel;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.istroeimpl.FirstBorthel;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.SecondBorthel;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.whoreimpl.WhoreFactory;
import com.example.demodespatter.designpattern.factory.simplefactdemo.constant.WSytleConstantdd;
import com.example.demodespatter.designpattern.factory.simplefactdemo.store.AbsWhore;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatterTests {

    WhoreFactory whoreFactory = new WhoreFactory();

    FirstBorthel borth = new FirstBorthel(whoreFactory);
    
    SecondBorthel secBorth = new SecondBorthel();
    
    ThirdBorthel thirdBorthel = new ThirdBorthel();

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
    
    @Test
    void testThridBorhel(){
        thirdBorthel.orderWhore("big tits");
    }
}
