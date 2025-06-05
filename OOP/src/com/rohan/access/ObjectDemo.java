package com.rohan.access;

public class ObjectDemo{
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo demo = new ObjectDemo(45);
        ObjectDemo demo2 = new ObjectDemo(45);

        System.out.println(demo.hashCode());
        System.out.println(demo2.hashCode());

        if(demo == demo2) {
            System.out.println("Equals");
        }

        if(demo.equals(demo2)) {
            System.out.println("equal");
        }
    }
}
