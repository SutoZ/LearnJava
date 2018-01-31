package com.company;


    class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public String startEngine() {
        return "Engine is started.";
    }

    public String accelerate() {
        return "The car is accelerating.";
    }

    public String brake() {
        return "The car brakes.";
    }
}

    class Bugatti extends Car {
        public Bugatti(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " engine starts.";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "accelerates.";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + "brakes.";
        }
    }


    class Ferrari extends Car {
        public Ferrari(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " engine starts.";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + "accelerates.";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + "brakes.";
        }
    }

    class Lamborgini extends Car {
        public Lamborgini(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "lamborgini engine starts.";
        }

        @Override
        public String accelerate() {
            return "Lamborgini accelerates.";
        }

        @Override
        public String brake() {
            return "Lamborgini brakes.";
        }
    }

    public class Main {

        public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic",3.56, "Sausage","White");

        double price = hamburger.itemizeHamburger();

        hamburger.addHambugerAddition1("Tomato", 0.27);
        hamburger.addHambugerAddition2("Lettuce", 0.75);
        hamburger.addHambugerAddition3("Cheese", 1.12);


        HealthyBurger healthyBurger = new HealthyBurger(5.67, "Bacon");
        healthyBurger.addHambugerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        price = healthyBurger.itemizeHamburger();
            System.out.printf("Healthyburger price: " + price + " " + healthyBurger.asdf());


            DeluxeBurger deluxeBurger = new DeluxeBurger();
            deluxeBurger.addHambugerAddition1("Should not do this", 50.53);
            deluxeBurger.itemizeHamburger();
        }
    }
