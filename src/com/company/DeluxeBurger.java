package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", 14.54, "Sausage & Bacon", "White");
        super.addHambugerAddition1("Chips", 2.75);
        super.addHambugerAddition2("Drink", 1.81);
    }

    @Override
    public void addHambugerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger!");
    }

    @Override
    public void addHambugerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger!");
    }

    @Override
    public void addHambugerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger!");
    }

    @Override
    public void addHambugerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe burger!");
    }
}
