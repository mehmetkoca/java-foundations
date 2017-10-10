package com.mehmetkoca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player mehmet = new Player("Mehmet", 50, 100);
        System.out.println(mehmet.toString());
        saveObject(mehmet);

        mehmet.setHitPoints(75);
        System.out.println(mehmet);
        mehmet.setWeapon("Glaive");
        saveObject(mehmet);
        //loadObject(mehmet);
        System.out.println(mehmet);

        //Monster werewolf = new Monster("Werewolf",20,40);
        //System.out.println(werewolf.getStrength());
        ISaveable werewolf = new Monster("Werewolf",20,40);
        System.out.println("Strength = " + ((Monster)werewolf).getStrength());
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                    "1 to enter a string\n"+
                    "0 to quit");
        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
