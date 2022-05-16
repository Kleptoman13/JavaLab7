package com.company;

public class Drobs {
    private Drob[] drobs;
    private double d1;
    private double d2;
    private int currentProductNumber;

    public Drobs(final int drobsNumber)
    {
        this.drobs = new Drob[drobsNumber];
        currentProductNumber = -1;
    }

    public void addDrob (Drob drob)
    {
        if (++currentProductNumber < drobs.length)
        {
            drobs[currentProductNumber] = drob;
        }
    }

    public double findD1()
    {
        d1 = (drobs[2].findDrob() + drobs[0].findDrob())*drobs[2].ChangedDrob();
        return d1;
    }

    public double findD2()
    {
        d2 = (drobs[1].findDrob() - drobs[1].ChangedDrob())/drobs[1].findDrob();
        return d2;
    }



    public String toString()
    {
        String result = "Drobs: " + System.lineSeparator();

        for (Drob drob:drobs)
        {
            result += drob + System.lineSeparator();
        }
        return result;
    }
}
