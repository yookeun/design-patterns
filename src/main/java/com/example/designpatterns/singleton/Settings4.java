package com.example.designpatterns.singleton;

public class Settings4 {

    private Settings4() {}

    //내부 스태틱 클래스를 사용하여 보다 간단하게 구현할 수 있다.
    // 해당 클래스가 생성될때 내부 스태틱 클래스로 최초 1회만 생성이 된다
    private static class SettingsHolder {
        private static final Settings4 SETTINGS = new Settings4();
    }

    public static Settings4 getInstance() {
        return SettingsHolder.SETTINGS;
    }
}
