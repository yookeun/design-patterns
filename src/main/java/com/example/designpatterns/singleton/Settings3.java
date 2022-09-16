package com.example.designpatterns.singleton;

public class Settings3 {

    // 이른 초기화 사용 (eager initialization) , 안쓰는데도  미리 만들어버리는 비효율성이 나온다.
    private static volatile Settings3 instacne;

    private Settings3() {}

    //double checked locking 사용
    //synchronized가 instance 가 null일 경우에만 적용되므로 효율적이다.
    public static Settings3 getInstance() {
        if (instacne == null) {
            synchronized (Settings3.class) {
                if (instacne == null) {
                    instacne = new Settings3();
                }
            }
        }
        return instacne;
    }
}
