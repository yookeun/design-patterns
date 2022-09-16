package com.example.designpatterns.singleton;

public class Settings2 {

    // 이른 초기화 사용 (eager initialization) , 안쓰는데도  미리 만들어버리는 비효율성이 나온다.
    private static final Settings2 INSTANCE = new Settings2();

    private Settings2() {}

    public static Settings2 getInstance() {
        return INSTANCE;
    }
}
