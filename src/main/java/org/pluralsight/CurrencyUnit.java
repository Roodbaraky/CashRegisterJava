package org.pluralsight;

public class CurrencyUnit {
    String name;
    double value;

    public CurrencyUnit(String name, double value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return this.name;
    }

    public double getValue() {
        return this.value;
    }
}
