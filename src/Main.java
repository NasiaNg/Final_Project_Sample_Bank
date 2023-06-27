//Scanner Class
//Switch Statement
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int p;
        int y = 1234;
        int Amount = 500;
        int result;
        int info;
        int f;
        int g;


        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Sample Bank App. For example purposes, your PIN number is 1234.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter PIN number ");
            p = in.nextInt();
            if (p == y) {
                System.out.println("You have entered the correct PIN number. ");
                boolean end = false;
                do {
                    System.out.println("\nPress 1 to View Bank Account.");
                    System.out.println("Press 2 to Deposit money");
                    System.out.println("Press 3 to Withdraw money");
                    System.out.println("Press 4 to Look At Credit Cards");
                    System.out.println("Press 5 to for Budget Buddy");
                    info = in.nextInt();

                    switch (info) {
                        case 1 -> System.out.println("You have " + Amount + "$ available.");
                        case 2 -> {
                            System.out.println("You have " + Amount + "$ available.");
                            System.out.println("Please enter the amount you wish to deposit: ");
                            f = in.nextInt();
                            result = Amount + f;
                            System.out.println("You now have " + result + "$ available.");
                        }
                        case 3 -> {
                            System.out.println("You have " + Amount + " $ available.");
                            System.out.println("Please enter the amount you would like to withdraw: ");
                            g = in.nextInt();
                            if (g > 500) {
                                System.out.println("You cannot withdraw more than your current balance.");
                            } else {
                                System.out.println("You have successfully withdrawn " + g + " $");
                                result = Amount - g;
                                System.out.println("You now have " + result + "$ available.");
                            }
                        }
                        case 4 -> System.out.println("You will be redirected to Credit Cards shortly.");
                        case 5 -> {
                            System.out.println("You will be redirected to Budget Buddy shortly.");
                            BudgetBuddy mpObject = new BudgetBuddy();
                            mpObject.monthlyBudget();
                        }
                        default -> System.out.println("Error, invalid input.");
                    }
                    return;
                } while (!end);
            } else {
                System.out.println("You have entered the incorrect PIN number. Please try again.");
            }
        }
    }
}