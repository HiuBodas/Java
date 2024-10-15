
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brt_com
 */
public class mahasiswa{
     static void data(){
         String nama, kelas, Nim, alamat;
        Scanner mahasiswa = new Scanner(System.in);
        System.out.println("======Data mahasiswa======");
        System.out.print("Nama : ");
         nama = mahasiswa.nextLine();
        System.out.print("Kelas : "); 
       kelas = mahasiswa.nextLine();
       System.out.print("Nim : ");
       Nim = mahasiswa.nextLine();
        System.out.print("alamat: ");
       alamat = mahasiswa.nextLine();
        System.out.println("--------------------");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nim: " + Nim);
        System.out.println("alamat: " + alamat);
    }
}
