package com.example.demodespatter.testannation;


import com.example.demodespatter.testannation.impl.ClassInfo;
import com.example.demodespatter.testannation.impl.FieldInfo;
import com.example.demodespatter.testannation.impl.MethodInfo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 测试运行时注解
 */
class DemoAnnotaion {

    public static void main(String[] args) {
        testRuntimeAnnotation();
    }

    private static void testRuntimeAnnotation(){

        StringBuilder sb = new StringBuilder();
        ArrayList<String> strings = new ArrayList<>();


        Class<?> cls = TestRuntimeAtion.class;
//        Constructor<?>[]  constructors = cls.getConstructors();

       // 获取指定类型的注解
        sb.append("Class注解：").append("\n");
        ClassInfo classInfo=  cls.getAnnotation(ClassInfo.class);
        if(classInfo!=null){
            sb.append(Modifier.toString(cls.getModifiers())).append(" ")
                    .append(cls.getSimpleName()).append("\n");
            sb.append("注解值: ").append(classInfo.value()).append("\n\n");
        }


        sb.append("Field注解：").append("\n");
        Field[] fields = cls.getDeclaredFields();
        for(Field field  :  fields){
            FieldInfo fieldInfo = field.getAnnotation( FieldInfo.class );
            if( fieldInfo != null ){
                sb.append(Modifier.toString(field.getModifiers())).append(" ")
                        .append(field.getType().getSimpleName()).append(" ")
                        .append(field.getName()).append("\n");
                sb.append("注解值: ").append(Arrays.toString(fieldInfo.value())).append("\n\n");
            }
        }



        sb.append("Method注解：").append("\n");
        Method[]methods = cls.getDeclaredMethods();
        for(Method method : methods){
            MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);

            if(methodInfo != null){
                sb.append(Modifier.toString(method.getModifiers())).append(" ")
                        .append(method.getReturnType().getSimpleName()).append(" ")
                        .append(method.getName()).append("\n");

                sb.append("注解值: ").append("\n");
                sb.append("name: ").append(methodInfo.name()).append("\n");
                sb.append("data: ").append(methodInfo.data()).append("\n");
                sb.append("age: ").append(methodInfo.age()).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
