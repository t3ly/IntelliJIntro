package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((float)((getValue()-32) * (5.0/9.0)));
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }


    public String toString()
    {
        // TODO: Complete this method
        return getValue() + " F";
    }
}

