package com.rohan.staticExample;

//class Test {
//    static String name;
//    public Test(String name) {
//        Test.name = name;
//    }
//}

public class InnerClasses {
      //an object is not needed to be created of Innerclass to access this so we can use this class directly to create
        //objects.
    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test test = new Test("Test"); //Test needs to be static to use like this as it's dependant on the Innerclass
        //and thus needed a object of Innerclass to acces Test if not static

        Test a = new Test("Rohan");
        Test b = new Test("Rahim");
        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
    }
}
