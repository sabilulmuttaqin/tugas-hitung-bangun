package modul2;
import modul2.bangun3d.*;
import modul2.bangun2d.*;

import java.util.Scanner;

public class driver {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jalan = true;
        
        System.out.println("---Welcome to Calculator gwej---");
        System.out.println("Pilih cuy");
        System.out.println("Ingin menghitung apa? ");
        System.out.println("1.Bangun datar 2D ");
        System.out.println("2.Bangun datar 3D ");
        
        do{
        System.out.print("Silahkan memilih: ");
        int pilih = input.nextInt();
        
        if (pilih==1){
            hitung2D();
        } else if (pilih==2){
            hitung3D();
            
        } else {
           System.out.println("Masukkan data dengan benar!");
           jalan = false;
        }
        } while(jalan == false);
        input.close();
    }

    
    public static void hitung2D(){
        Scanner input = new Scanner(System.in);
        
        int pilihmasbro;
        
        System.out.println("Hitung luas dan kelilig bangun datar 2D");
            System.out.println("1.Persegi");
            System.out.println("2.Persegi Panjang");
            System.out.println("3.Segitiga");
            System.out.println("4.Lingkaran");
            System.out.println("5.Belah Ketupat");
            System.out.println("6.Jajar Genjang");
            System.out.print("Pilih bangun 2D: ");
            pilihmasbro = input.nextInt();
            
            switch(pilihmasbro){
                case 1 -> {
                    persegi p = new persegi();
                    p.setSisi();
                    p.infoBangun();
                    p.hitungLuas();
                    p.hitungKeliling();
            }
                case 2 -> {
                    persegiPanjang pp = new persegiPanjang();
                    pp.setPanjang();
                    pp.setLebar();
                    pp.infoBangun();
                    pp.hitungLuas();
                    pp.hitungKeliling();
            }
                case 3 -> { 
                    segitiga sg = new segitiga();
                    sg.setAlas();
                    sg.setTinggi();
                    sg.infoBangun();
                    sg.hitungKeliling();
                    sg.hitungLuas();
            }
                case 4 -> {
                    lingkaran ling = new lingkaran();
                    ling.setJari();
                    ling.infoBangun();
                    ling.hitungKeliling();
                    ling.hitungLuas();
            }
                case 5 -> {
                    bKetupat bk = new bKetupat();
                    bk.setD1();
                    bk.setD2();
                    bk.setSisi();
                    bk.infoBangun();
                    bk.hitungKeliling();
                    bk.hitungLuas();
            }
                case 6 -> {
                    jajarGenjang jg = new jajarGenjang();
                    jg.setAlas();
                    jg.setTinggi();
                    jg.setMiring();
                    jg.infoBangun();
                    jg.hitungLuas();
                    jg.hitungKeliling();
            }
                default -> System.out.println("Masukkan angka dengan benar!");
            }
            input.close();
    }
    
    
    public static void hitung3D(){
     Scanner input = new Scanner(System.in);
      
        int pilihbg;
        System.out.println("Hitung volume datar 3D");
            System.out.println("1.Kubus");
            System.out.println("2.Bola");
            System.out.println("3.Kerucut");
            System.out.println("4.Balok");
            System.out.println("5.Tabung");
            System.out.print("Pilih bangun 3D: ");
            pilihbg = input.nextInt();
            
            switch(pilihbg){
                case 1 : 
                    kubus kub = new kubus();
                    System.out.print("Masukkan sisi: ");
                    kub.setRusuk();
                    kub.infoBangun();
                    kub.hitungVolume();
                    break;
                case 2 :
                    bola bol = new bola();
                    bol.setJari();
                    bol.infoBangun();
                    bol.hitungVolume();
                    break;
                case 3:
                    kerucut krc = new kerucut();
                    krc.setJari();
                    krc.setTinggi();
                    krc.infoBangun();
                    krc.hitungVolume();
                    break;
                case 4:
                    balok blk = new balok();
                    blk.setPanjang();
                    blk.setLebar();
                    blk.setTinggi();
                    blk.infoBangun();
                    blk.hitungVolume();
                    break;
                case 5:
                    tabung tbg = new tabung();
                    System.out.print("Masukkan jari-jari: ");
                    tbg.setJari(input.nextInt());
                    System.out.print("Masukkan tinggi: ");
                    tbg.setTinggi(input.nextInt());
                    tbg.infoBangun();
                    tbg.hitungVolume();
                    break;
                default:
                    System.out.println("Masukkan pilihan dengan benar!");
            }
            input.close();
}
}

