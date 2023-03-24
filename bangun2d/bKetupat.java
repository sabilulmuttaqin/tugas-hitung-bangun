
package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class bKetupat extends LKBangun2D{
    private double d1,d2,sisi;
    Scanner input = new Scanner(System.in);
    public double getD1() {
        return d1;
    }

    public void setD1() {
        System.out.print("Masukkan diagonal 1: ");
        d1 = input.nextDouble();
    }

    public double getD2() {
        return d2;
    }

    public void setD2() {
        System.out.print("Masukkan diagonal 2");
        d2 = input.nextDouble();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi() {
        System.out.print("Masukkan sisi: ");
        sisi = input.nextDouble();
    }

    @Override
    public void infoBangun(){
        System.out.println("Belah ketupat dengan diagonal 1" + getD1() +" dan diagonal 2" + getD2()+ " dan sisi " + getSisi());
    }
    @Override
    public void hitungLuas(){
        luas = 0.5 * d1 *d2;
        super.hitungLuas();
    }
    
    @Override
    public void hitungKeliling(){
        keliling = 4*sisi;
        super.hitungKeliling();
    }
}
