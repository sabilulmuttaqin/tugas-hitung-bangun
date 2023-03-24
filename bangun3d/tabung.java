package modul2.bangun3d;
import modul2.LKBangun3D;
public class tabung extends LKBangun3D{
    private double jari,tinggi;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    
    
    @Override
    public void infoBangun(){
        System.out.println("Tabung dengan jari-jari "+ getJari() +" dan tinggi " + getTinggi());
    }
    
    @Override
    public void hitungVolume(){
       volume = 0.33 * 3.14 * jari * jari * tinggi; 
        super.hitungVolume();
    }
}
