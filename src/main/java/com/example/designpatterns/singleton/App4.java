package com.example.designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App4 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Settings6 settings6 = Settings6.INSTANCE;

        //리플렉션 사용 막기 (에러 발생)
        Constructor<Settings6> constructor = Settings6.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings6 settings61 = constructor.newInstance();

        System.out.println(settings6 == settings61);
    }
}
