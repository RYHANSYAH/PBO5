/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RAYHANSYAH
 */
public class BujurSangkar extends BangunDatar {
    
    BujurSangkar (int s){
        super(s);
    }
    
    int HitungLuas(){
       int s = super.getS();
       return s*s;
    }
    int HitungKeliling(){
        int s = super.getS();
        return 4*s;
    }
    public String toString(){
        String hasil = "Luas Bujur Sangkar  :"+ HitungLuas()+"\n"+"Keliling Bujur Sangkar"+ HitungKeliling();
        return hasil;
    }
}
