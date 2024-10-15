
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
public class matakuliah {
       static void matkul(){
        String nama, nilai ;
         int sks; 
        Scanner matakuliah = new Scanner(System.in);
        System.out.print("Nama matkul : ");
         nama = matakuliah.nextLine();
          System.out.print("Nilai : ");
          nilai = matakuliah.nextLine();
          System.out.print("Sks : "); 
          sks = matakuliah.nextInt();
           System.out.println("--------------------");
        System.out.println("Nama matkul: " + nama);
        System.out.println("Sks: " + sks);
        System.out.println("Nilai: " + nilai); 
        
    }
}
