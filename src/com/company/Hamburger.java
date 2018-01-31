package com.company;

public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public void addHambugerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;

        System.out.println("Added " + addition1Name + " for and extra " + addition1Price);
    }

    public void addHambugerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;

        System.out.println("Added " + addition2Name + " for and extra " + addition2Price);
    }

    public void addHambugerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;

        System.out.println("Added " + addition3Name + " for and extra " + addition3Price);
    }

    public void addHambugerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;

        System.out.println("Added " + addition4Name + " for and extra " + addition4Price);
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger: " + " on a " + this.breadRollType + " roll with "
                + this.meat + ", price is " + this.price);

        if (this.addition1Name != null) {
            hamburgerPrice += addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null) {
            hamburgerPrice += addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null) {
            hamburgerPrice += addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null) {
            hamburgerPrice += addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }

    public String asdf() {
        return "klgskdflgk";
    }
}
