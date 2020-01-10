package com.kevin.learn.learn.spring;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:测试反射 访问private私有方法
 * @Author: Kevin
 * @Create 2019-12-26 14:33
 */
public class FanShe {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException, NoSuchFieldException, ClassNotFoundException {
        Person person = new Person();
//        这里person.是没有say的方法的
        //用反射
//        Class<?> personType = person.getClass();
        final Class<?> personType = Class.forName("com.kevin.learn.learn.spring.Person");
        Method say = personType.getDeclaredMethod("say", String.class);
        say.setAccessible(true);
        say.invoke(person, "Hello world");
        //访问私有属性
        Field field = personType.getDeclaredField("name");

        field.setAccessible(true);

        //为属性设置值;person为所在对象
        field.set(person, "WalkingDog");

        System.out.println("The Value Of The Field is : " + person.getName());

    }
}

/**
 * 一个java Bean
 */
class Person {
    private String name;

    //每个JavaBean都应该实现无参构造方法
    public Person() {
    }

    public String getName() {
        return name;
    }

    private void say(String message) {
        System.out.println("You want to say : " + message);
    }
}
