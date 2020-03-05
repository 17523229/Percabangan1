/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan1;

import java.util.Scanner;

/**
 *
 * @author Harry Akbar - 17523229
 */
public class Percabangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Inisialisasi Variabel
        boolean R;
        boolean W;
        boolean H = true;
        
        // menggunakan library scanner
        Scanner input = new Scanner(System.in);
        
        // memunculkan output pertanyaan pertama
        System.out.println("It's raining today? true/false");
        
        // input pilihan pertanyaan pertama
        H = input.nextBoolean();
        
        // memunculkan output pertanyaan kedua
        System.out.println("It's windy today? true/false");
        
        // input pilihan pertanyaan kedua
        W = input.nextBoolean();
        
        
        // percabangan dari pilihan jawaban pertanyaan
        if(!H && !W){
            System.out.println("Piknik !!");
        } else if(!H && W){
            System.out.println("Ngampus Aja !!");
        } else if(H && !W){
            System.out.println("Ke Kampus Pake Mantel !!");
        } else if(H && W){
            System.out.println("REBAHAN !!");
        }
    }
}
