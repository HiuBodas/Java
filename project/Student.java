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
public class Student extends LibraryMember {
    private int nim;
    public Student(String name, String alamat, int memberId, int nim) {
        super(name, alamat, memberId);
        this.nim = nim;
    }
      public int getNim(){
        return nim;
    }
    

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Student)" + ", Kode member :" + getMemberId() + ", Nim :" + getNim() + ", Alamat " + getAlamat() + ", Has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
}
