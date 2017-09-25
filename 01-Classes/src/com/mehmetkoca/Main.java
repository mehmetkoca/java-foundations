package com.mehmetkoca;

public class Main {

    public static void main(String[] args) {
	    Book galaxy = new Book();
	    Book sapiens = new Book();
        galaxy.setName("The Hitchhiker's Guide To The Galaxy");
        sapiens.setName("Sapiens A Brief History Of Humankind");
	    System.out.println(galaxy.getName() + " and "+ sapiens.getName() +" books are great!");
    }
}
