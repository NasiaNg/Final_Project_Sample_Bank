/*Array List*/
/*Do-While Loop*/

import java.util.ArrayList;
import java.util.Scanner;

public class BudgetBuddy {
    public void monthlyBudget() {
        System.out.println("====================");
        System.out.println("Budget Buddy");
        System.out.println("=====================");
        System.out.println("\nPlease type your total spending budget in US dollars: ");
        System.out.println(" ");
/* Scanner Class and 2 Array Lists, total budget value from user */
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        double sum = 0;
        int counter = 0;
        int i = 0;
        ArrayList<Double> percent = new ArrayList<>();
        ArrayList<String> label = new ArrayList<>();

        System.out.println("Total budget set at $" + total);

        do {
            System.out.println("Type your percentage of expense " + (counter + 1) + ":");
            double value = scan.nextDouble();
            percent.add(value);
            scan.nextLine();
            sum += percent.get(counter);
            counter++;
            System.out.println("Give this task a name. ");
            String name = scan.nextLine();
            label.add(name);

/* Do-While Loop */
        } while (sum <= 100);
        scan.close();

/* Once we reach 100, stop taking values */
        if (sum >= 100) {
            double cumulativeSum = 0.0;
            for (int j = 0; j < percent.size() - 1; j++) {
                cumulativeSum += percent.get(j);
            }
            percent.set(percent.size() - 1, 100.0 - cumulativeSum);
        }

        System.out.println("\n" + "Any percentages over 100 have been adjusted to fit budget. ");
        System.out.println(" ");

/* Math calculation and output values */
        for (double value : percent) {
            String labelNum = label.get(i);
            double expense = value * total / 100.0;
            System.out.println("Your allocation for " + labelNum + " (" + value + "%) equals: $" + expense);
            i++;
        }
        System.out.println("Thank you for using this tool!");
    }

}