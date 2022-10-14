package com.company;

public class Man extends Human{

    public Man(String name, int age, int iq) {
        super(name, age, iq);
    }

    @Override
    public void goPee() {
        System.out.println("na stojaka");
    }

    public void eat(){
        System.out.println("haminy haminy");
    }
    public void driving(String vehicle){
        System.out.println("is driving a car");
    }

}
