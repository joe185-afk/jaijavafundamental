package org.juaracoding.jaijavafundamental.testharian.praktikum3;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IE-222.4345.35, built on October 26, 2022
@Author Windows a.k.a. Joe Andreas Indahsi
Java Developer
Created on 11/9/2023 9:07 AM
@Last Modified 11/9/2023 9:07 AM
Version 1.0
*/

import java.util.Random;

public class Praktikum3 {
    public static void main(String[] args) {
        Random rando = new Random();
        int looping;
        char character;
        int flag = 0;

        do{
            looping = rando.nextInt(25);
        }while(looping < 12);

        for(int k = 0; k < looping; k++){
            if(k < 7){
                if(k == 0){
                    character = (char)(rando.nextInt(26) + 'a');
                    if(character == 'a' || character == 'i' || character == 'u' ||
                            character == 'e'|| character == 'o'){
                        flag = 1;
                    }else{
                        flag = 2;
                    }
                    System.out.print(Character.toUpperCase(character));
                }else{
                    if(flag == 1){
                        do{
                            character = (char)(rando.nextInt(26) + 'a');
                        }while(character == 'a' || character == 'i' || character == 'u' ||
                                character == 'e'|| character == 'o');
                        flag = 2;
                    }else{
                        do{
                            character = (char)(rando.nextInt(26) + 'a');
                        }while(!(character == 'a' || character == 'i' || character == 'u' ||
                                character == 'e'|| character == 'o'));
                        flag = 1;
                    }
                    System.out.print(character);
                }
            }else{
                character = (char)(rando.nextInt(26) + 'a');
                System.out.print(character);
            }
        }
    }
}
