/*
 * update belah ketupat
 * lebih baru lagi
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod82;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnalmod82 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) { 
        int n ;
        Scanner in = new Scanner(System.in);
           System.out.print("masukkan angka :");
           n= in.nextInt();
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                if (Math.abs(i) + Math.abs(j) <= n) System.out.print("* ");
                else                                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    
}
