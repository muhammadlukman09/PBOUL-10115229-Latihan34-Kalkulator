/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan34.kalkulator;



/**
 *
 * @author Lukman
 * NIM      : 10115229
 * Nama     : Muhammad Lukman Hakim
 * Kelas    : PBO ULANG
 */
public class TestKalkulator {
    
    double isioperan1;
    double isioperan2;
    double hasil;
    
    void inisial(){
        isioperan1 = 0;
        isioperan2 = 0;
    }
    
    void penjumlahan(double isioperan1, double isioperan2){
        hasil = isioperan1 + isioperan2;
        System.out.println("");
        System.out.println(isioperan1 + " + " + isioperan2 + " = " + hasil);
    }
    
    void pengurangan(double isioperan1, double isioperan2){
        hasil = isioperan1 - isioperan2;
        System.out.println("");
        System.out.println(isioperan1 + " - " + isioperan2 + " = " + hasil);
    }
    
    void perkalian(double isioperan1, double isioperan2){
        hasil = isioperan1 * isioperan2;
        System.out.println("");
        System.out.println(isioperan1 + " x " + isioperan2 + " = " + hasil);
    }
    
    void pembagian(double isioperan1, double isioperan2){
        hasil = isioperan1 / isioperan2;
        System.out.println("");
        System.out.println(isioperan1 + " / " + isioperan2 + " = " + hasil);
    }
    
    void pangkat(double isioperan1, double isioperan2){
        hasil = Math.pow(isioperan1,isioperan2);
        System.out.println("");
        System.out.println(isioperan1 + " Pangkat " + isioperan2 + " = " + hasil);
    }
}
