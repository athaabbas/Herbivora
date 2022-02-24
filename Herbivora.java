
package Herbivora;

public class Herbivora {

    private String ciri;
    private String makan;
    private String habitat;
    private String waktuTidur;

    public String getCiri() {
        return ciri;
    }
    public void setCiri(String ciri) {
        this.ciri = ciri;
    }
    public String getMakan() {
        return makan;
    }
    public void setMakan(String makan) {
        this.makan = makan;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getwaktuTidur(){
        return waktuTidur;
    }
    public void setwaktuTidur(String waktuTidur){
        this.waktuTidur = waktuTidur;
    }
    public void herbivor() {
        System.out.println("Herbivora adalah hewan pemakan tumbuhan");
    }
}