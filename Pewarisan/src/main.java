/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        System.out.println("info Mobil");
        mobil.jenismobil("Hilux");
        mobil.bensin("Hilux");
        mobil.nyala("Hilux");
        System.out.println("info Motor");
        motor.jenismobil("Blade");
        motor.bensin("Blade");
        motor.nyala("Blade");
    }
    
}

        class kendaraan{
            static void jenismobil(String name){
                System.out.println(name + " Jenis kendaraan gigi");
            }
            static void bensin(String name){
                System.out.println(name + " Bensin Pertamax");
            }
        }
         class mobil extends kendaraan{
         static void nyala(String name){
                System.out.println(name + " nyalakan mesinn");
            }
             
}
        class motor extends kendaraan{
         static void nyala(String name){
                System.out.println(name + " nyalakan mesinn");
            }
             
}
