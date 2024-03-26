package com.mycompany.projsenin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B-15
 */
import java.util.Scanner;

/**
 *
 * @author A-15
 */
public class NewClass {
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiA = 10;
        int nilaiB = 20;
        
        double nilaiC = 1;
        double nilaiD = 2;
        
        boolean IsPlus = true;

        System.out.println("Nilai A: " + nilaiA);
        System.out.println("Nilai B: " + nilaiB);
        System.out.println("Nilai C: " + nilaiC);
        System.out.println("Nilai D: " + nilaiD);
        System.out.println("Is Plus: " + IsPlus);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan angka untuk variabel A");
        nilaiA = input.nextInt();
        System.out.println("Masukkan angka untuk variabel B");
        nilaiB = input.nextInt();
        System.out.println("Masukkan angka untuk variabel C");
        nilaiC = input.nextDouble();
        System.out.println("Masukkan angka untuk variabel D");
        nilaiD = input.nextDouble();
        
        System.out.println("masukkan teks");
        String teks = input.nextLine();
        teks = input.nextLine();
        
        System.out.println("Nilai A: " + nilaiA);
        System.out.println("Nilai B: " + nilaiB);
        System.out.println("Nilai C: " + nilaiC);
        System.out.println("Nilai D: " + nilaiD);
        System.out.println("Is Plus: " + IsPlus);
        System.out.println("teks : " + teks);
         
    }
    
}