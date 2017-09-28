package com.mehmetkoca;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Nissan extends Car {
    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Nissan -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Nissan -> accelerate()";
    }

    @Override
    public String brake() {
        return "Nissan -> brake()";
    }
}

 class Opel extends Car {
    public Opel(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Opel -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Opel -> accelerate()";
    }

    @Override
    public String brake() {
        return "Opel -> brake()";
    }
}

 class Suzuki extends Car {
    public Suzuki(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Nissan nissan = new Nissan(6,"Nissan");
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.brake());

        Opel opel = new Opel(6,"Nissan");
        System.out.println(opel.startEngine());
        System.out.println(opel.accelerate());
        System.out.println(opel.brake());

        Suzuki suzuki = new Suzuki(6,"Nissan");
        System.out.println(suzuki.startEngine());
        System.out.println(suzuki.accelerate());
        System.out.println(suzuki.brake());


    }
}
