import java.util.Scanner;

class LessThanException extends Exception {
        public LessThanException (String str)
        {
            super(str);
        }
}
public class CreditScore {
        static void validate ( int score) throws LessThanException {
            System.out.println("Your credit score is " + score);
            if (score < 600) {

                // throw an object of user defined exception
                throw new LessThanException("Credit Score is too low");
            } else {
                System.out.println("Good Credit Score! You are eligible for a credit card");
            }
        }

        public static void creditCheck() {
            try {
                validate(500);
            } catch (LessThanException ex) {
                System.out.println("Exception occurred: " + ex);
            }
    }
}
