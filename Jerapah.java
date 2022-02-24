
package Herbivora;

import Herbivora.Herbivora;

public class Jerapah extends Herbivora{
    
    String ciri = super.getCiri ();
    String makan = super.getMakan ();
    String ciri2 = "lehernya panjang";
    String makan2 = "daun";
  
    public void herbivor (){
        System.out.println("Herbivora sebagian besar merupakan mamalia");
    }
    public void cetak (){
        System.out.println("===============================================");
        System.out.println("Jerapah ciri-cirinya adalah "+ciri2);
        System.out.println("Jerapah adalah pemakan "+makan2);
    }
 
}