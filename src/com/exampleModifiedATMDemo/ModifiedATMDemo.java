package com.exampleModifiedATMDemo;

/**
 * Created by elyseturner on 9/16/14.
 */
import java.util.Scanner;
public class ModifiedATMDemo {

        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);
            int i, anotherTransaction;
            double myAccountBalance = 100000;
            double withdrawThisMuch, addThisMoneyToAccount;



            do {
                System.out.println("Thank you for visiting George Banks\n" +
                        "Enter 1 to see your account balance\n" +
                        "Enter 2 to withdraw funds\n" +
                        "Enter 3 to deposit funds\n" +
                        "Enter 4 to quit");
                i = userInput.nextInt();

                switch (i) {

                    case 1:
                        displayAccountBalance(myAccountBalance);
                    case 2:
                        System.out.println("How much would you like to withdraw?");
                        withdrawThisMuch = userInput.nextDouble();
                        System.out.println("You want to withdraw " + withdrawThisMuch);
                        withdrawSomeMoney(myAccountBalance,withdrawThisMuch);


                    case 3:
                        System.out.println("How much would you like to deposit?");
                        addThisMoneyToAccount = userInput.nextDouble();
                        System.out.println("You want to deposit " + addThisMoneyToAccount);

                    default:
                        System.out.println("That is not a valid number, please try again");
                }

            } while(i != 4);

        }

        public static void displayAccountBalance(double balance) {
            System.out.println(balance);
        }

        public static void withdrawSomeMoney(double balance,double amountToWithdraw){
          balance = balance - amountToWithdraw;
            System.out.println(balance);
        }

        public static void acceptMoney(double balance, double amountToDeposit){
            balance = balance + amountToDeposit;
            System.out.println(balance);

        }

    }




