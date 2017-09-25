package com.mehmetkoca;

public class Main {

    public static void main(String[] args) {
        Almera almera = new Almera(48);
        almera.steer(50);
        almera.accelerate(20);
        almera.accelerate(30);
        almera.accelerate(-39);
    }
}
