package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class persegi extends LKBangun2D  {
    Scanner input = new Scanner(System.in);
    private double sisi;
   
    public void setSisi() {  
        System.out.print("Masukkan sisi: ");
        sisi = input.nextDouble();
    }

    public double getSisi() {
        return sisi;
    }
    
    @Override
    public void infoBangun(){
        System.out.println("Persegi dengan sisi " + getSisi());
    }
    
    
    @Override
    public void hitungLuas (){
        luas = sisi*sisi;
        super.hitungLuas();
    }
    
    @Override
    public void hitungKeliling(){
        keliling = 4*sisi;
        super.hitungKeliling();
    }
}
