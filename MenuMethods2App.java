package gr.aueb.cf.ch4;

import java.util.Scanner;

public class MenuMethods2App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        //int result0 = 0;
        //int result1 = 0;
        //int result2 = 0;
        int n = 0;

        do{
            System.out.println("1. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("2. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("3. Εμφάνισε n γραμμές με η αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1");
            System.out.println("6. Exit");
            System.out.println(" Δώσε επιλογή");
            choice = sc.nextInt();

            switch (choice){
                case 0:
                    System.out.println(+ nStarsHor(n));
                    break;
                case 1:
                    System.out.println(+ nStarsVer(n));
                    break;
                case 2:
                    System.out.println(+ nStars(n));
                    break;
                case 3:
                    System.out.println(+ nStarsAsc(n));
                    break;
                case 4:
                    System.out.println(+ nStarsDesc(n));
                    break;
                default:
                    System.out.println("Exit from the program");
            }

        }while (choice != 0);
            System.out.println(" Επιλέξτε αριθμό απο 1 εως 6");
    }

    public static int nStarsHor(int n) {
        Scanner sc = new Scanner(System.in);
        int result0 = 0;
        System.out.println("Please insert your (number) choice, to print Stars: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result0 += 1;
            System.out.print(" * ");
        }
        System.out.println();
        return result0;
    }

    public static int nStarsVer(int n) {
        Scanner sc = new Scanner(System.in);
        int result1 = 0;
        System.out.println("Please insert your (number) choice, to print Stars: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result1 += 1;
            System.out.println(" * ");
        }
        System.out.println();
        return result1;
    }

    public static int nStars(int n) {
        Scanner sc = new Scanner(System.in);
        int result2 = 0;
        int result9 = 0;
        System.out.println("Please insert your (number) choice, to print Stars: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            return result2;
        }   System.out.println(" * ");
            return result9;
        }

    public static int nStarsAsc(int n) {
        Scanner sc = new Scanner(System.in);
        int result2 = 0;
        System.out.println("Please insert your (number) choice, to print Stars: ");
        n = sc.nextInt();


        for( int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            return result2;
        }
                System.out.println(" * ");
                System.out.println();
          return result2;
    }

    public static int nStarsDesc(int n) {
        Scanner sc = new Scanner(System.in);
        int result2 = 0;
        System.out.println("Please insert your (number) choice, to print Stars: ");
        n = sc.nextInt();


        for( int i = 0; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
            return result2;
        }
        System.out.println(" * ");
        System.out.println();
        return result2;
    }
}