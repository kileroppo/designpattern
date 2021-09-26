package com.example.demodespatter;

import javassist.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Description: 测试java序列和反序列
 * @author: lizp
 * @date: 2021年09月26日 9:46
 */
@Slf4j
@SpringBootTest
public class testModeiferForObj {




    /**
     * 总结： 类: ClassPool.getDefault();
     *       字段：new CtField(filedType, initValue)
     *       方法：CtMethod.make("method body code",clazz.class)
     * @throws Exception
     */
    @Test
    public  void testJavaAssist2() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get(ClassModifer.class.getName());
        CtClass xppTest = pool.makeClass("com.example.demodespatter.XppTest");


        CtField idField = new CtField(CtClass.longType, "name", xppTest);
        xppTest.addField(idField,"666L");
        CtField ageField = new CtField(CtClass.intType, "age", xppTest);
        xppTest.addField(ageField,"18");


        CtMethod getAgeMethod = CtMethod.make("public int getAge() { return this.age;}", xppTest);
        CtMethod setAgeMethod = CtMethod.make("public void setAge(int age) { this.age = age;}", xppTest);
        xppTest.addMethod(setAgeMethod);
        xppTest.addMethod(getAgeMethod);

        //设置父类
//        xppTest.setSuperclass(pool.get("com.example.demodespatter.Person"));

        String cmd = "System.out.println(\"this is evil code\");";
        ctClass.makeClassInitializer().insertBefore(cmd);
        xppTest.writeFile();


        Class aClass = xppTest.toClass();
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





//        String cmd = "System.out.println(\"this is evil code\");";
//        // 创建 static 代码块，并插入代码
//        ctClass.makeClassInitializer().insertBefore(cmd);
//        String randomClassName = "EvilCat" + System.nanoTime();
//        // 设置为随机的类名、文件名
//        ctClass.setName(randomClassName);
//        // 写入.class 文件
//        ctClass.writeFile();
    }

}
