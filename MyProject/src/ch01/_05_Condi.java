package ch01;

import java.util.Scanner;

public class _05_Condi {
    public static void main(String[] args) {
        // and(&&) , or(||) % : 나머지
//        String hong = "good";
//        String str[] = {"A","B","C"};
//
//        if(hong == "good") {
//            System.out.println("if " + "good");
//        } else if(hong == "no") {
//            System.out.println("No !");
//        }
//
//        for(int i = 0; i < 3; i++) {
//            System.out.println("for " +hong);
//        }
//
//        for(int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        int iw = sc.nextInt();
//
//        while(iw < 10) {
//            System.out.println(iw); //print : col println : row
//            iw++;
//        }
//
//        sc.close();

//        for (int i = 0; i < 10; i += 2) {
//            System.out.print(i);
//        }

        // do while
//        do {
//
//        } while();

        // 이중반복문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
