package org.juaracoding.jaijavafundamental.testharian.praktikum1;
import java.util.Scanner;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IE-222.4345.35, built on October 26, 2022
@Author ${USER} a.k.a. Joe Andreas Indahsi
Java Developer
Created on ${DATE} ${TIME}
@Last Modified ${DATE} ${TIME}
Version 1.0
*/

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kata = "";
        System.out.print("Masukan kata : ");
        kata = scan.nextLine();
        int hasil = 0;
        int panjangKata = kata.length();
        char karakter;

        for(int l = 0; l < panjangKata; l++){
            karakter = kata.charAt(l);
            if(karakter >= 32 && karakter <= 90){
                hasil += (int) karakter;
            }
        }

        System.out.println("Hasil : " + hasil);
    }
}
