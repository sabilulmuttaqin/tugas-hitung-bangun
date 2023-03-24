package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class lingkaran extends LKBangun2D {
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
        System.out.println("Lingkaran dengan jari- jari: " + getJari());
    }
    
    @Override
    public void hitungLuas(){
    luas = 3.14*jari*jari;
    super.hitungLuas();
    }
    
    @Override
    public void hitungKeliling(){
    keliling = 2 * 3.14*jari;
    super.hitungKeliling();
    }

    
}
