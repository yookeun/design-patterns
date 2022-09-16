package com.example.designpatterns.singleton;

import java.io.*;

public class App3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings5 settings5 = Settings5.getInstance();
        Settings5 settings51;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings5);
        }


        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings51 = (Settings5) in.readObject();
        }
        System.out.println(settings5 == settings51);

    }
}
