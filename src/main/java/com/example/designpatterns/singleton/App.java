package com.example.designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();
        System.out.println(settings1 == settings2);

        Settings1 settings3 = Settings1.getInstance();
        Settings1 settings4 = Settings1.getInstance();
        System.out.println(settings3 == settings4);


        Settings2 settings5 = Settings2.getInstance();
        Settings2 settings6 = Settings2.getInstance();
        System.out.println(settings5 == settings6);

        Settings3 settings7 = Settings3.getInstance();
        Settings3 settings8 = Settings3.getInstance();
        System.out.println(settings7 == settings8);

        Settings4 settings9 = Settings4.getInstance();
        Settings4 settings10 = Settings4.getInstance();
        System.out.println(settings9 == settings10);
    }
}
