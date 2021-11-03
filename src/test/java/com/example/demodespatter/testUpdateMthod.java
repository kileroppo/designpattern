package com.example.demodespatter;

import com.example.demodespatter.designpattern.XppTest;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description: 修改生成累的代码
 * @author: lizp
 * @date: 2021年09月26日 11:15
 */
@Slf4j
@SpringBootTest
public class testUpdateMthod {


    @Test
    public void testUpdateMthod()  {

        try {
//            CtClass xppTest = ClassPool.getDefault().get("com.example.demodespatter.XppTest");
            CtClass xppTest = ClassPool.getDefault().get("com.example.demodespatter.designpattern.XppTest");

            // 修改 xppTest method
            String oldMethodName = "setAge";
            CtMethod oldMethod = xppTest.getDeclaredMethod(oldMethodName);
            String newMethodName = oldMethodName + "$impl";
            oldMethod.setName(newMethodName);

            // 新方法
            CtMethod newMethod = CtNewMethod.copy(oldMethod, oldMethodName, xppTest, null);

            String newMthodBody = "{\nlong start= System.currentTimeMillis();\n" +
                    newMethodName + "($$); \n" +
                    "System.out.println(\"Call to method " + oldMethodName
                    + " took \" +\n (System.currentTimeMillis()-start) + " + "\" ms.\");\n" +
                    "}";
            newMethod.setBody(newMthodBody);
            xppTest.addMethod(newMethod);


            Class aClass = xppTest.toClass();
            XppTest xppInstance = (XppTest) aClass.newInstance();
            xppInstance.setAge(66666);

            printfObjPropies(aClass);
        } catch (Exception e) {
            log.error("execute method fail:" + e.getMessage());
            e.printStackTrace();
        }

    }

    public void printfObjPropies(Class aClass){
        System.out.println("------------属性列表------------");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields){
            System.out.println(field.getType() + "\t" + field.getName());
        }
        System.out.println("------------方法列表------------");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method :
                declaredMethods) {
            System.out.println(method.getReturnType() + "\t" + method.getName());
        }
    }
}
