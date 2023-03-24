package modul2;

public class LKBangun2D {
    protected double luas;
    protected double keliling;

    protected double getLuas() {
        return luas;
    }

    protected void setLuas(double luas) {
        this.luas = luas;
    }

    protected double getKeliling() {
        return keliling;
    }

    protected void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    
    
    protected void infoBangun(){
        
    }
    
    protected void hitungLuas(){
        System.out.println("Luas bangun datar 2D adalah: "+luas);
    }
    protected void hitungKeliling(){
        System.out.println("Keliling bangun datar 2D adalah: " + keliling);
    }
}
    
