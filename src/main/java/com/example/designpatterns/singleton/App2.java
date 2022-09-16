package com.example.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App2 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Settings4 settings4 = Settings4.getInstance();

        //리플렉션 사용하기
        Constructor<Settings4> constructor = Settings4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings4 settings41 = constructor.newInstance();

        System.out.println(settings4 == settings41);
    }
}
