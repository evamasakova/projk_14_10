package com.company;

public class Woman extends Human {

    public Woman(String name, int age, int iq) {
        super(name, age, iq);
    }
    public void eat(){
        System.out.println("mnam mnam mnam je to fresh mam to rada");
    }

    @Override
    public void goPee() {
        System.out.println("trunim");
    }

    public void sharkweek(){
        System.out.println("is dying of pain");
    }
}
