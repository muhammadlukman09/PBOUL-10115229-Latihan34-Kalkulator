/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan34.kalkulator;

import java.util.Scanner;
/**
 *
 * @author Lukman
 * NIM      : 10115229
 * Nama     : Muhammad Lukman Hakim
 * Kelas    : PBO ULANG
 */
public class PBOUL10115229Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  

    Scanner inputan = new Scanner(System.in);
        
        TestKalkulator isi;
        isi = new TestKalkulator();
        double operan1;
        double operan2;
        String pilih;
        
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.println("--------------------");
        System.out.print("Masukan Angka ke 1 = ");
        operan1 = inputan.nextInt();
        System.out.print("Masukan Angka ke 2 = ");
        operan2 = inputan.nextInt();
        
        System.out.println("--------------------");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.println("5. Pangkat");
        System.out.print("Pilih Menu : ");
        pilih = inputan.next();
        System.out.println("--------------------");
        
        switch(String.valueOf(pilih)){
        case "1" : isi.penjumlahan(operan1,operan2);break;
        case "2" : isi.pengurangan(operan1,operan2);break;
        case "3" : isi.perkalian(operan1,operan2);break;
        case "4" : isi.pembagian(operan1,operan2);break;
        case "5" : isi.pangkat(operan1,operan2);break;
        default : System.out.println("Menu yang anda pilih tidak ada!");
        }
    }
}
    

