
package Herbivora;

//import Herbivora.KelelawarBuah;
//import Herbivora.Jerapah;
//import Herbivora.Herbivora;

public class Main_Herbivora {
    public static void main (String[] args){
        Jerapah hewan1 = new Jerapah();
        KelelawarBuah hewan2 = new KelelawarBuah();
        Herbivora herb = new Herbivora();
        
        herb.setCiri("lehernya panjang");
        herb.setMakan("daun");
        
        herb.setHabitat ("pepohonan");
        herb.setwaktuTidur ("siang hari");
        
        herb.herbivor();
        hewan1.herbivor ();      
        hewan2.herbivor ();
        
        hewan1.cetak ();
        hewan2.cetak ();
    }
}