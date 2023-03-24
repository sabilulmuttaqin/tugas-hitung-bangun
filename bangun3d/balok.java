
package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;
public class balok extends LKBangun3D {
    private double panjang,lebar,tinggi;
    Scanner input = new Scanner(System.in);
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang() {
        System.out.print("Masukkan panjang: ");
        panjang = input.nextDouble();
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar() {
        System.out.print("Masukkan lebar: ");
        lebar = input.nextDouble();
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi() {
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
    }

    
    
    @Override
    public void infoBangun(){
        System.out.println("Balok dengan " + getPanjang() + ", lebar" + getLebar() + ", dan tinggi "+ getTinggi());
    }
    
    @Override
    public void hitungVolume(){
        volume = panjang*lebar*tinggi;
        super.hitungVolume();
     
    }
}
