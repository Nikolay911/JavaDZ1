package com.DZ1.abe;

import com.DZ1.abe.Author;

public class Book {
    private String name;
    private  Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(int kolAutors) {

        String autorsName = "";

        String[] masAutors = new String[kolAutors];

        for(int i=0;i<kolAutors;i++) {
            masAutors[i] = "[" + "name= " + authors[i].getName() + ", " + "email= " + authors[i].getEmail() + ", " + "gender= " + authors[i].getGender() +"]";
        }
        String allAuthor = "";

        for(int i=0;i<kolAutors;i++) {
            if(i==kolAutors-1)
                allAuthor = allAuthor + masAutors[i];
            else
                allAuthor = allAuthor + masAutors[i] + ", ";
        }

        return "Book [ " +
                "name= '" + name + '\'' +
                ", authors={ " + allAuthor + " }" +
                ", price= " + price +
                ", qty= " + qty +
                ']';
    }

    public String getAuthorName(int kolAutors){

        String autorsName = "";

        for(int i=0;i<kolAutors;i++){
            if(i==kolAutors-1)
                autorsName = autorsName  + authors[i].getName();
            else
                autorsName = autorsName  + authors[i].getName()+ ", ";
        }
        return autorsName;
    }
}

