
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KOMPUTER JARKOM 37
 */

public class HitungBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("===Isikan Pilihan===");
        
        int pilihan = sc.nextInt();
        if(pilihan==1){
            System.out.println("\n Masukan Nilai Sisi");
            int s = sc.nextInt();
            
            BujurSangkar bs = new BujurSangkar(s);
            System.out.println(bs);

        }
        else if (pilihan==2){
            System.out.println("\n Masukan Nilai Panjang");
            int p = sc.nextInt();
            
            System.out.println("\n Masukan Nilai Lebar");
            int l = sc.nextInt();
            
            PersegiPanjang pp= new PersegiPanjang(p,l);
            System.out.println(pp);
        }
    }
}
