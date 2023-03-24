
package modul2.bangun3d;
import java.util.Scanner;
import modul2.LKBangun3D;
public class bola extends LKBangun3D {
    private double jari;
    Scanner input = new Scanner(System.in);
    public double getJari() {
        return jari;
    }

    public void setJari() {
        System.out.print("Masukkan jari-jari: ");
        jari = input.nextDouble();
    }

    
    @Override
    public void infoBangun(){
        System.out.println("Bola dengan jari: " + getJari());   
    } 
    @Override
    public void hitungVolume(){
      volume = 4/3 * 3.14 * (jari*jari*jari);  
      super.hitungVolume();
    }
}