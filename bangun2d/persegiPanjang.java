package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class persegiPanjang extends LKBangun2D {
    protected double panjang;
    protected double lebar;
    Scanner input = new Scanner(System.in);

    public void setPanjang() {
        System.out.print("Masukkan panjang: ");
        panjang = input.nextDouble();
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar() {
        System.out.print("Masukkan lebar: ");
        lebar = input.nextDouble();
    }

    @Override
    public void infoBangun(){
        System.out.println("Persegi panjang dengan panjang " + getPanjang() + " dan lebar " + getLebar());
    }
    
    @Override
    public void hitungLuas(){
        luas = panjang*lebar;
        super.hitungLuas();
    } 
    @Override
    public void hitungKeliling(){
        keliling = 2 * (panjang*lebar);
        super.hitungKeliling();
    }
}
