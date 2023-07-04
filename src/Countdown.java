/* Stack and Abstract */
import java.util.*;
abstract class countDown {
    public abstract void Count();

    public void numbers() {
        System.out.println("\nPlease refresh the page if you are not redirected in 1 minute.\n");
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    static class Words extends countDown {
        public void Count() {

            System.out.println("\nYou will be redirected now, thank you for your patience!");
            System.out.println(" ");
        }
    }
}
