package com.example.demodespatter.test1;

import com.example.demodespatter.designpattern.Observe.ObserveImpl;
import com.example.demodespatter.designpattern.Observe.SubjectImpls;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class TestDesginPattern {

    @Autowired
    SubjectImpls subjectImpls;

    @Autowired
    ObserveImpl observeImpl;

   @Test
   public void test() {
       subjectImpls.addObeserve(observeImpl);

       subjectImpls.updateObersver();
   }

}
