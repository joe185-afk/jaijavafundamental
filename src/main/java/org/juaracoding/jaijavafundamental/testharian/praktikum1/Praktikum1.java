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

        int temp1 = 0;
        int temp2 = 0;
        int spesialKarakter = -1;
        int spasi = 0;
        for(int m = kata.length()-1; m >= 0; m--){
            if(!((kata.charAt(m) >= 48 && kata.charAt(m) <=57) ||
                (kata.charAt(m) >= 65 && kata.charAt(m) <=90) ||
                (kata.charAt(m) >= 97 && kata.charAt(m) <=122)))
            {
                if(spesialKarakter == -1){
                    spesialKarakter = m;
                }
            }
            if(kata.charAt(m) == ' '){
                spasi = m;
                break;
            }
        }
        temp1 = spesialKarakter - spasi - 1;

        for(int w = 0; w < kata.length(); w++) {

            if (!((kata.charAt(w) >= 48 && kata.charAt(w) <= 57) ||
                    (kata.charAt(w) >= 65 && kata.charAt(w) <= 90) ||
                    (kata.charAt(w) >= 97 && kata.charAt(w) <= 122))) {
                if(kata.charAt(w) == ' '){
                    continue;
                }else{
                    temp2 = w;
                    break;
                }
            }
        }

        int x;
        int y;
        int z;

        z = (temp2+temp1)/2;
        y = temp2 - z;
        x = temp1 - y;

        System.out.println("Hasil : " + x + y + z);
    }
}
