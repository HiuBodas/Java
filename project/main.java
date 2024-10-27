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

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book[] Books = {
            new Book(" The Poppy War ", " R.F Kuang ", " Fiksi Fantasi", 168000),
            new Book(" Metamorfosis ", " Franz Kafka ", " Fiksi Fantasi",180000),
            new Book(" Reverend Insanity ", " Gu Zhen Ren ", " Light Novel ", 58000),
            new Book(" Jujutsu kaisen ", " Gege akutami ", " Manga ", 40000),
            new Book(" Jojo's bizarre adventure ", " Hiroki Araki ", " Manga ", 40000)
        };
       
        System.out.println("========== Daftar Buku di Perputakaan ===========");
        System.out.println("-----------------------------------------------");
       for (Book Book : Books){
            System.out.println("- " + Book.getTitle() + "oleh " + Book.getAuthor()+ "jenis/genre = " + Book.getDeskripsi() + "(Rp " + Book.getHarga() + ")");
       }
       System.out.println("------------------------------------------------");
        LibraryMember[] LibraryMember = {
            new Student("Allice", "California ", 4567,  2384847),
            new Teacher("Mr.David", "San Fransisco ", 5788, 355673)
        };
        for (LibraryMember Members : LibraryMember){
            System.out.println();
        }

        // Polymorphism: Both student and teacher are treated as LibraryMember
        LibraryMember[0].borrowBook(Books[0]); // Alice (Student) borrows "The Poppy War"
        LibraryMember[1].borrowBook(Books[1]);//Mr.David (Lecturer) borrowa "metamorfosis"
        
         LibraryMember[0].returnBook(Books[0], 3);
         LibraryMember[1].returnBook(Books[1], 0);
    }
    
}
