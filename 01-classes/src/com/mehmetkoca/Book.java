package com.mehmetkoca;

public class Book {
    private String name;
    private int pages;
    private String author;
    private String ISBN;
    private String imprint;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        String validName = name.toLowerCase();
        if (validName.equals("the hitchhiker's guide to the galaxy") || validName.equals("sapiens a brief history of humankind")){
            this.name = name;
        } else {
            this.name = "Unknown :(";
        }

    }
}
