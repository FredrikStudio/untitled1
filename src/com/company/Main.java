package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(score >= 90 && score<=100) {
            System.out.println("A");
        }

        if(score >= 70 && score<=89){
            System.out.println("B");
        }

        if(score >= 40 && score <=69){
            System.out.println("C");
        }

        if(score >= 0 && score <=39) {
            System.out.println("D");
        }
    }
}
