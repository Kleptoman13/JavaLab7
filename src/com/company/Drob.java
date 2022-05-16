package com.company;

public class Drob {
    private int a;
    private int b;

    private double delAB;


    public Drob(int a, int b)
    {
        this.setA(a);
        this.setB(b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public double findDrob()
    {
        delAB = (double)getA()/getB();
        return delAB;
    }


    public double ChangedDrob()
    {
        double temp1 = getA();
        double temp2 = getB();
        return temp2 / temp1;
    }

    public double StepenDrob(int stepen)
    {
        int temp1 = (int)Math.pow(getA(), stepen);
        int temp2 = (int)Math.pow(getB(), stepen);
        return temp1/temp2;
    }


    @Override
    public String toString() {
        return "Drob{" +
                "a/b=" + getA() +
                "/" + getB() +
                ", " + findDrob() +
                ", b/a=" + ChangedDrob() +
                "}";
    }
}
