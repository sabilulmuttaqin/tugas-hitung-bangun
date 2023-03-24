package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class segitiga extends LKBangun2D {
 private double alas, tinggi;
Scanner input = new Scanner(System.in);
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

   
 @Override
    public void infoBangun(){
        System.out.println("Segitiga dengan alas " + getAlas() + " dan tinggi " + getTinggi());
    }
    
 @Override
    public void hitungLuas(){
        luas = 0.5* alas * tinggi;
        super.hitungLuas();
    }
    
 @Override
    public void hitungKeliling(){
        keliling = alas*3 ;
        super.hitungKeliling();
    }
 
}
