package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        final int NumberDrobs = 3;
        Random random = new Random();
        Drob[] drob1 =new Drob[NumberDrobs];
        Drobs drobs = new Drobs(NumberDrobs);
        for (int i = 0; i < NumberDrobs; i++) {
            drob1[i] = new Drob(random.nextInt(10) + 1, random.nextInt(10) + 1);
            drobs.addDrob(drob1[i]);
        }

        System.out.println(drobs);

        System.out.println("d1 = " + drobs.findD1());
        System.out.println("d2 = " + drobs.findD2());
    }

}
