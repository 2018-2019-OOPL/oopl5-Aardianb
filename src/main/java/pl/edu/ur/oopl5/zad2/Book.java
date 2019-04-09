/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.zad2;

/**
 *
 * @author student
 */
public class Book {
    
    public String title;
    public String author;
    public int pages;
    public int year;
    public int price;
    
    public Book(String title, String author, int pages, int year, int price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }
    
    public void showData(){
        System.out.println("Ksi¹¿ka");
        System.out.println("Tytu³: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Strony: " + this.pages);
        System.out.println("Rok: " + this.year);
        System.out.println("Cena: " + this.price + "z³");
    }
}
