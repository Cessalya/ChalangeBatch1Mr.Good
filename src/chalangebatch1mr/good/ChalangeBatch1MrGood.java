/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chalangebatch1mr.good;

/**
 *
 * @author LENOVO
 */import java.util.Scanner;
public class ChalangeBatch1MrGood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi Variabel
    int BukuMatematika,BukuKimia,BukuBiologi,BukuFisika;
    double TotalBayar,HargaBuku,Diskon,Total;
    boolean running = true;
    Scanner input=new Scanner (System.in);
    String jawab;
    // Perulangan
    // Masukkan Data Buku
    
    while (running) {
        System.out.println("<<<<<<__Toko Buku__>>>>>>");
        System.out.println("Total Buku Matematika = ");
        BukuMatematika=input.nextInt();
        System.out.println("Total Buku Kimia = ");
        BukuKimia=input.nextInt ();
        System.out.println("Total Buku Biologi = ");
        BukuBiologi=input.nextInt ();
        System.out.println("Total Buku Fisika = ");
        BukuFisika=input.nextInt ();
        
        HargaBuku=25000.5;
        Total= (BukuMatematika+BukuKimia+BukuBiologi+BukuFisika)*HargaBuku;
        if (Total>300000) {
            Diskon = 0.3*Total;
            TotalBayar=Total-Diskon;
            System.out.println("Selamat Anda Mendapat Diskon 30%");
            System.out.println("<<<<<<__Nota Pembelian__>>>>>>");
            System.out.println("Total yang harus di bayar = Rp"+TotalBayar);
            
        } else {
            System.out.println("<<<<<<__Nota Pembelian__>>>>>>");
            System.out.println("Anda tidak mendpat diskon");
            System.out.println("Total yang harus di bayar = Rp"+Total);
        }
        // Percabangan
        System.out.println("Apakah Anda ingin belanja lagi ? [jawab "+ "ya/tidak]");
        jawab = input.next ();
        if (jawab.equalsIgnoreCase("ya")){
            running = true;
        }
        if (jawab.equalsIgnoreCase("tidak")){
            running = false;
    }
    }
                
    }
    
}
