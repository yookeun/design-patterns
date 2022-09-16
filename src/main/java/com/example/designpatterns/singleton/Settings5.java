package com.example.designpatterns.singleton;

import java.io.Serializable;

public class Settings5 implements Serializable {

    private Settings5() {}

    //내부 스태틱 클래스를 사용하여 보다 간단하게 구현할 수 있다.
    private static class SettingsHolder {
        private static final Settings5 SETTINGS = new Settings5();
    }

    public static Settings5 getInstance() {
        return SettingsHolder.SETTINGS;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
