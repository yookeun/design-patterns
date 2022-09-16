package com.example.designpatterns.singleton;

public class Settings1 {
    private static Settings1 instance;

    private Settings1() {}

    //스레드에 안전하지만 매번 호출할때마다 락이 발생한다. 
    public static synchronized Settings1 getInstance() {
        if (instance == null) {
            instance = new Settings1();
        }
        return instance;
    }
}
