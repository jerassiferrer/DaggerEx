package com.mobile.jera.daggerex;

/**
 * Created by jera on 6/25/16.
 */
public class Country {
    private String name;
    private String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }
}
