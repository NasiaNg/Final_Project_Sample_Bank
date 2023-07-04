/* Scanner, Switch Statement, Method Override, Constructors,
To String, Super Keyword, Inheritance, Stack,
Exception, Interface, Hashmap, Abstract, Encapsulation,
Array List, Do-While Loop
Nasia Nguyen nasian1@umbc.edu*/
import java.util.Scanner;
public class MainPage {
/* Properties */
    public String annualFee;
    public int cashback;
    public double interestRate;
/* Public Constructors */
    public MainPage(String annualFee, int cashback, double interestRate) {
        this.annualFee = annualFee;
        this.cashback = cashback;
        this.interestRate = interestRate;
    }

/* ToString() & Method Override */
    @Override
    public String toString() {
        return ("Annual Fee= " + annualFee + "\n" + "Cash Back= " + cashback + "%" + "\n" + "Interest Rate= " + interestRate + "%" + "\n");
    }
/* Inheritance & Super Keyword */
    static class Bronze extends MainPage {
        public Bronze(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

    static class Silver extends MainPage {
        public Silver(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

    static class Gold extends MainPage {
        public Gold(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

    static class Diamond extends MainPage {
        public Diamond(String annualFee, int cashback, double interestRate) {
            super(annualFee, cashback, interestRate);
        }
    }

        public static void main(String[] args) {

        int p;
        int y = 1234;
        int Amount = 300;
        int result;
        int info;
        int f;
        int g;

        MainPage BronzeCard = new MainPage("None", 1, 29.80);
        MainPage SilverCard = new MainPage("None", 2, 24.61);
        MainPage GoldCard = new MainPage("$95", 5, 18.30);
        MainPage DiamondCard = new MainPage("$150", 10, 15.00);

        Scanner in = new Scanner(System.in);
        System.out.println("\nWelcome to Sample Bank App. For example purposes, your PIN number is 1234.\n");
/* Interface */
        Time myTime = new Time();
        myTime.dt();


        for (int i = 0; i < 3; i++) {
            System.out.println("\nPlease enter PIN number: ");
            p = in.nextInt();
            if (p == y) {
                System.out.println("You have entered the correct PIN number. ");
                System.out.println("");
                NewAccount naObject = new NewAccount();
                naObject.exampleAcct();
                System.out.println("");

                boolean end = false;
                do {
/* Encapsulation */
                    System.out.println("\nPress 1 to View Bank Account");
                    System.out.println("Press 2 to Deposit Money");
                    System.out.println("Press 3 to Withdraw Money");
                    System.out.println("Press 4 to Look At Credit Cards");
                    System.out.println("Press 5 to For Budget Buddy");
                    System.out.println("Press 6 to Check Credit Score");
                    System.out.println("Press 7 to Exit the Application");
                    info = in.nextInt();

                    switch (info) {
                        case 1 ->
                        System.out.println("You have " + Amount + "$ available.");
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
                        case 4 -> {
                            System.out.println("You will be redirected to Credit Cards shortly." + "\n");
                            System.out.println("=====================");
                            System.out.println("Available Credit Cards:");
                            System.out.println("====================="+ "\n");
                            System.out.println("Bronze Card");
                            System.out.println(BronzeCard);
                            System.out.println("Silver Card");
                            System.out.println(SilverCard);
                            System.out.println("Gold Card");
                            System.out.println(GoldCard);
                            System.out.println("Diamond Card");
                            System.out.println(DiamondCard);
/* Hashmap */
                            MoreRewards mrObject = new MoreRewards();
                            mrObject.rewards();
                        }
/* Stack and Abstract */
                        case 5 -> {
                            System.out.println("\nYou will be redirected to Budget Buddy shortly.");
                            countDown.Words myWords = new countDown.Words();
                            myWords.numbers();
                            myWords.Count();

/*Array List, Do-While Loop*/
                            BudgetBuddy mdObject = new BudgetBuddy();
                            mdObject.monthlyBudget();

                        }
                        case 6 -> {
/* Exception, Super Keyword */
                            CreditScore csObject = new CreditScore();
                            csObject.creditCheck();

                        }
                        case 7 ->
                            System.exit(0);
                        default -> System.out.println("Error, invalid input. Please try again.");
                    }
                } while (true);
            } else {
                System.out.println("You have entered the incorrect PIN number. Please try again.");
            }
        }
    }
}