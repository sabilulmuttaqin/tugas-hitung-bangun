package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class jajarGenjang extends LKBangun2D {
    private double alas,tinggi,miring;
    Scanner input = new Scanner (System.in);
    public double getAlas() {
        return alas;
    }

    public void setAlas() {
        System.out.print("Masukkan alas: ");
        alas = input.nextDouble();
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi() {
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();
    }

    public double getMiring() {
        return miring;
    }

    public void setMiring() {
        System.out.println("Masukkan sisi miring: ");
        miring = input.nextDouble();
    }
    
    
    @Override
    public void infoBangun(){
        System.out.println("Jajar genjang dengan alas " + getAlas() + ",tinggi " + getTinggi()+ "dan sisi miring "+ getMiring());
        
    }
    @Override
    public void hitungLuas(){
        luas = alas*tinggi;
        super.hitungLuas();
    }
    @Override
    public void hitungKeliling(){
        keliling = 2 * (alas+miring);
        super.hitungKeliling();
    }
}
