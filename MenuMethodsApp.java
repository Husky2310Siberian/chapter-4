package gr.aueb.cf.ch4;

import java.util.Scanner;

public class MenuMethodsApp {

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        int a = 0;
        int n = 0;


        System.out.println("Παρακαλώ εισάγετε εναν αριθμό απο 1-6");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια ");  //να μπεί μέθοδος printmenu που να επιλέγει το 1,2,3,4,5,6,
        n = sc.nextInt();

        System.out.println(+ menuOption1(n));

    }


        public static int menuOption1 (int n){

            int result = 0;

            for (int i = 1; i <= n ; i++){

            }
            return result;
    }
}