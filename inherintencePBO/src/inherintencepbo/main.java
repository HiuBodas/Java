/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherintencepbo;

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
        burung mybird = new burung();
        burung.animal();
    }
    
}
            class animal{
            String name;
            public void kawin(){
                System.out.println("animal sedang kawin");
            }
       }
       class burung extends animal{
       public void kawin(){
                System.out.println("burung sedang kawin");
       }
       }
               
