package com.company;

public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal("yoy", 8, "pes", "pink"); //zadani parametru
        System.out.println(myAnimal);

        Man myMan = new Man("honza", 22, -6);
        myMan.eat();
        myMan.driving("bus");

        Woman myWoman = new Woman("zuza", 846, 5);
        myWoman.sharkweek();

        myMan.goPee(); //abstrakt metoda
        myWoman.goPee();





    }



}
