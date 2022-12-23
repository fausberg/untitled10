package org.example;

public class C extends A implements D{
    @Override
    public void move() {
        super.move();
        System.out.println("Okay");
    }

    @Override
    public void debil() {
        System.out.println("1");
    }
}
