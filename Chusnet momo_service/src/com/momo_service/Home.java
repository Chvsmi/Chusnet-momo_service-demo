package com.momo_service;

import java.util.Scanner;
public class Home {
    private static double balance;
    private static double loadGet;

    public static void main(String[] args) {

        System.out.println("Welcome to \"Chusnet\" MoMo Service");
        System.out.println("-----------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose Option\n 1. signIn\n 2. signUp");
        int sign = input.nextInt();
        if (sign == 1) {
            signIn();
        }
        else if (sign ==2) {
            signUp();
        }else System.out.println("Invalid input");
    }

    private static void signUp() {
        System.out.println();
        Scanner input = new Scanner(System.in);


        System.out.println("Provide your credentials");
        System.out.println("-----------------------------");

        //   try {
        System.out.print("Enter your your first name: ");
        String firstName = String.valueOf(input.nextLine());

        System.out.print("Enter your your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter password: ");
        Integer password = input.nextInt();
        input.nextLine();

        System.out.print("Enter your your gender M/F: ");
        String gender = input.nextLine().toUpperCase();
        if (gender.equals("M") | gender.equals("F")) {
            System.out.print("Enter your Telephone: ");
            int telephone = input.nextInt();
            input.nextLine();
            System.out.print("Enter your your Next of King: ");
            String nextOfKing = String.valueOf(input.nextLine());
            System.out.println();
        } else {
            System.out.print("\nEnter a valid detail ");
        }
        if (!(firstName.isEmpty()) | !(lastName.isEmpty()) | !(gender.isEmpty())) {
            System.out.println("successfully registered!");
            int accountNumber= 2344;
            System.out.println("Full name:"+firstName+" "+lastName);
            System.out.print("Account No: "+ accountNumber);
        }

    }

    private static void signIn() {
        Scanner input = new Scanner(System.in);
       int accountNumber, password;

        System.out.println("Provide your credentials");
        System.out.println("-----------------------------");
        System.out.print("Enter your account number: ");
        accountNumber = input.nextInt();
//        accountNumber.toString();
        System.out.print("Enter password: ");
        password = input.nextInt();
//        password.toString();

        if (accountNumber == 2323 & password == 2323){
            mainMenu();
        }else System.out.println("Enter a invalid details");
 //        password.hashCode();

//        if (accountNumber == 2323){
//            System.out.println("success");
//        }
    }

    private static void mainMenu() {
        System.out.println("Welcome to \"Chusnet\" MoMo Service");
        System.out.println("-----------------------------");
        System.out.println("Account No: "+2323+" \t\t Balance: GHS "+ 9205.57);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Choose from the options below");
        System.out.println("1.Deposit\n2. Transfer\n3. Withdraw\n4. Loan ");
        int option = input.nextInt();

        switch (option){
            case  1:
                deposit();
                break;
            case 2:
                transfer();
                break;
            case 3:
                withdrawal();
                break;
            case 4:
                loan();
            default:
                System.out.println("Enter a valid input");

        }
    }

    private static void loan() {
        System.out.println("Welcome to \"Chusnet\" MoMo Service");
        System.out.println("-----------------------------");
        System.out.println("Account No: "+2323+" \t\t Balance: GHS "+ balance);
        System.out.print("Loan balance: GHS "+ 250);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: GHS ");
        int amount = input.nextInt();
        double loadDept = 0;
        if (amount <= loadGet & loadDept <= loadGet){
            System.out.println("Loan successfully granted");
        }else System.out.println("!request rejected");
    }

    private static void deposit() {
    }

    private static void withdrawal() {
        System.out.println("Welcome to \"Chusnet\" MoMo Service");
        System.out.println("-----------------------------");
        System.out.println("Account No: "+2323+" \t\t Balance: GHS "+ 9205.57);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: GHS ");
        int amount = input.nextInt();
        System.out.println("Enter withdrawal ID: ");
        int withdrawalID = input.nextInt();

        mainMenu();
    }

    private static void transfer() {
        System.out.println("Welcome to \"Chusnet\" MoMo Service");
        System.out.println("-----------------------------");
        System.out.println("Account No: "+2323+" \t\t Balance: GHS "+ 9205.57);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount: GHS ");
        int amount = input.nextInt();
        System.out.println("Enter receiver: ");
        int receiver = input.nextInt();

        mainMenu();
    }
}
