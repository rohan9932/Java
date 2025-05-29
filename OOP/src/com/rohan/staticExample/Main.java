package com.rohan.staticExample;

public class Main {
    public static void main(String[] args) {
        Human rohan = new Human(20, "Rohan", 0, false);
        Human afia = new Human(20, "Afia", 0, false);

        System.out.println(Human.population);
        System.out.println(Human.population);

//        greeting(); //we can't use this because it requires an instance

        //but we can do this
        Main obj = new Main();
        obj.greeting();
    }

    void greeting() {
        System.out.println("Hello ");
    }
}