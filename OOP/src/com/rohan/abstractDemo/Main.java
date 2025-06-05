package com.rohan.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Daughter daughter = new Daughter(23);
        daughter.career("Pilot");

        Son son = new Son(21);
        son.career("Software Engineer");

        son.normal();

        Parent.greeting();

        //We can also do
        Parent p = new Daughter(24);
        p.career("Doctor");

//        Parent mother = new Parent(); //we can't do this as we have to override the methods
    }
}
