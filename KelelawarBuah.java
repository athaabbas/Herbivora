
package Herbivora;

import Herbivora.Herbivora;

public class KelelawarBuah extends Herbivora {
    String habitat = super.getHabitat ();
    String waktuTidur = super.getwaktuTidur ();
    String habitat2 = "pepohonan";
    String waktuTidur2 = "siang hari";
    
    public void herbivor (){
        System.out.println("Herbivora hidup didarat");
    }
    public void cetak (){
        System.out.println("=============================================");
        System.out.println("Kelelawar berhabitat di "+habitat2);
        System.out.println("Kelelawar tidur pada "+waktuTidur2);
    }
}
