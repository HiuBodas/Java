/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Brt_com
 */
public class Book {
    private String title;
    private String author;
    private String deskripsi;
    private int harga;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String deskripsi, int harga) {
        this.title = title;
        this.author = author;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.isAvailable = true; // Default: Book is available when created
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }
    
    public String getDeskripsi(){
        return deskripsi;
    }
    
    public int getHarga(){
        return harga;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter to change availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
