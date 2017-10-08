package com.mehmetkoca;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
//        //Autoboxing
//        for (double dbl=0.0;dbl<=10.0;dbl+=0.5) {
//            myDoubleValues.add(Double.valueOf(dbl));
//        }
//        //Unboxing
//        for (int i=0;i<myDoubleValues.size();i++) {
//            double value = myDoubleValues.get(i).doubleValue();
//        }
        Bank bank = new Bank("National Turkish Bank");

        if (bank.addBranch("Istanbul")){
            System.out.println("Istanbul branch created.");
        }
        bank.addCustomer("Istanbul","Mehmet",500.0);
        bank.addCustomer("Istanbul","Hande",750.0);
        bank.addCustomer("Istanbul","Furkan",1000.0);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Hande", 457.83);

        bank.addCustomerTransaction("Istanbul","Mehmet",137.0);
        bank.addCustomerTransaction("Istanbul","Mehmet",33.6);
        bank.addCustomerTransaction("Istanbul","Furkan",1.87);

        bank.listCustomers("Istanbul",true);
        bank.listCustomers("Sydney",true);

        bank.addBranch("Izmir");
        if (!bank.addCustomer("Izmir","Ahmet",835.6)) {
            System.out.println("Error Izmir branch does not exist");
        }

        if (!bank.addBranch("Istanbul")){
            System.out.println("Istanbul branch already exist.");
        }

        if (!bank.addCustomerTransaction("Istanbul","Fatih",52.33)) {
            System.out.println("Customer does not exist.");
        }




    }
}
