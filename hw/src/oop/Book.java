/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author s2000
 */
public class Book extends Author{

    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        super.name = name;
        this.author = new Author();
        this.price = price;
        this.qty = qty;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "'" + name + "' by " + author;
    }
}
