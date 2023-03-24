
package modul2.bangun3d;
import java.util.Scanner;
import modul2.LKBangun3D;
public class kerucut extends LKBangun3D{
    private double tinggi,jari;
    Scanner input = new Scanner(System.in);

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi() {
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
    }

    public double getJari() {
        return jari;
    }

    public void setJari() {
        System.out.print("Masukkan jari-jari: ");
        jari = input.nextDouble();
    }
    
    @Override
    public void infoBangun(){
        System.out.println("Kerucut dengan jari-jari " + getJari() +" dan tinggi " + getTinggi());
    }
    @Override
    public void hitungVolume(){
        volume = 0.33 * 3.14 * jari * jari * tinggi;
        super.hitungVolume();
    }
}
