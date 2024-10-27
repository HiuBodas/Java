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
public class Teacher extends LibraryMember{
    private int kode;
    public Teacher(String name,String alamat, int memberId,  int kode) {
        super(name, alamat, memberId );
        this.kode = kode;
        
    }
        public int getkode(){
            return kode;
        }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Lecturer)" + ", Kode member : " + getMemberId() + ", Kode dosen :" + getkode()+ ", Alamat " + getAlamat() + ", Has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }
}
