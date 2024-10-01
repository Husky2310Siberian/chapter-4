package gr.aueb.cf.ch4;

import java.util.Scanner;

public class MenuSwitchApp {

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("choose between 0 to 3, 0 for exit");
            System.out.println("1. one-player game");
            System.out.println("2. two-player game");
            System.out.println("3. team game");
            choice= sc.nextInt();

            switch (choice){
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                System.out.println("start one player game");
                break;
            case 2:
                System.out.println("start two player game");
                break;
            case 3:
                System.out.println("start team game");
                break;
            default:
                System.out.println("error choice, please insert your choice");
            }
        }   while (choice!=0);
        System.out.println("thanks for using our app");
    }
}
