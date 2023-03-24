package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;
public class kubus extends LKBangun3D{
    private double rusuk;
    Scanner input = new Scanner(System.in);
    public double getRusuk() {
        return rusuk;
    }

    public void setRusuk() {
        System.out.print("Masukkan rusuk: ");
        rusuk = input.nextDouble();
    }

    @Override
    public void infoBangun(){
        System.out.println("Kubus dengan sisi: " + getRusuk());
    }
    @Override
    public void hitungVolume(){
        volume = rusuk*3;
        super.hitungVolume();
    }
   
}
