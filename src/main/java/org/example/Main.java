package org.example;


public class Main {

    public static void main(String[] args) {

        B b = new B(5);
        System.out.println(b.a);
        B b1 = new B(2);
        System.out.println(b1.a);
        System.out.println(b.a);

    }
}