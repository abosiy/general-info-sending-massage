package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {

        Phone[] array = new Phone[3];

        array[0] = new Phone("Maksym","0935881245", "iPhone", 123);
        array[1] = new Phone("Andrew", "0503809821","samsung", 120);
        array[2] = new Phone("Vlad", "0631239855", "xiaomi", 200);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println();

        System.out.println(array[0].receiveCall("Maksym"));
        System.out.println(array[1].receiveCall("Andrew"));
        System.out.println(array[2].receiveCall("Vlad"));

        System.out.println();

        System.out.println(array[0].getNumber());
        System.out.println(array[1].getNumber());
        System.out.println(array[2].getNumber());

        System.out.println();

        System.out.println(array[0].receiveCall("Ivan", "0735541209"));

        System.out.println();

        array[1].sendMessage("Hello! :)");
    }
}
