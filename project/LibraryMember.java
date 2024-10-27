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
public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String alamat;

    public LibraryMember(String name, String alamat, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
   
   
    // Abstraksi metode umum yang harus diimplementasikan oleh subclass
    public void borrowBook(Book book){
    if (book.isAvailable()){
        book.setAvailable(false);
        System.out.println(name + " Has borrowed the book: " + book.getTitle());
    }else{
        System.out.println("Sorry, " + book.getTitle() + " Is not Availble");
    }
    }


 public void returnBook(Book book, int lateDays) {
        book.setAvailable(true);
        double fine = calculateFine(lateDays);
        if (fine > 0) {
            System.out.println("=================== KETERANGAN ====================");
            System.out.println(name + " mengembalikan buku: " + book.getTitle() + " dengan denda Rp." + fine);
        } else {
            System.out.println(name + " mengembalikan buku: " + book.getTitle() + " tepat waktu");
        }
    }

    public double calculateFine(int lateDays) { 
        double dailyFine = 5000;
        return lateDays > 0 ? dailyFine * lateDays : 0;
    }
}