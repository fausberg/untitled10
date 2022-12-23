package org.example;

public class B extends A implements D {

    int a;


    public B(int a ){
        this.a = a;
    }



    public static void lock(){

    }

    @Override
    public void move() {
        super.move();
        System.out.println("denil");

    }

    public void cool(){

    }

    @Override
    public void debil() {
        System.out.println("2");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B b = (B) o;

        return a == b.a;
    }

    @Override
    public int hashCode() {
        return a;
    }


}
