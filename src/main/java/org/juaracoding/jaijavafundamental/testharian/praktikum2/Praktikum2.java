package org.juaracoding.jaijavafundamental.testharian.praktikum2;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IE-222.4345.35, built on October 26, 2022
@Author Windows a.k.a. Joe Andreas Indahsi
Java Developer
Created on 11/3/2023 9:55 AM
@Last Modified 11/3/2023 9:55 AM
Version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Praktikum2 {

    public static void main(String[] args) {
        int input;
        int jumlah = 0;
        List<Integer> num = new ArrayList<>();
        boolean tof = true;
        Scanner scan = new Scanner(System.in);

        while(tof){
            try{
                input = scan.nextInt();
                jumlah += input;
                num.add(input);
            }catch(Exception e){
                tof = false;
            }
        }
        if(num.size() != 0){
            System.out.println("Rata-rata: " + (jumlah*1.0)/(num.size()*1.0));
        }else{
            System.out.println("Rata-rata: " + 0);
        }
    }
}
