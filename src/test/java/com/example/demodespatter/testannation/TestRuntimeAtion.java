package com.example.demodespatter.testannation;

import com.example.demodespatter.testannation.impl.ClassInfo;
import com.example.demodespatter.testannation.impl.FieldInfo;
import com.example.demodespatter.testannation.impl.MethodInfo;

/**
 * 测试运行时注解
 */
@ClassInfo("Test Class")
public class TestRuntimeAtion {
 
    @FieldInfo(value = {1, 2})
    public String fieldInfo = "FiledInfo";
 
    @FieldInfo(value = {10086})
    public int i = 100;
 
    @MethodInfo(name = "BlueBird", data = "Big" , age=28)
    public static String getMethodInfo() {
        return TestRuntimeAtion.class.getSimpleName();
    }
}
