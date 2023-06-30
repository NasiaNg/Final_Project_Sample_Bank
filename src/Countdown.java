/* Stack */
import java.util.*;
public class Countdown {
    public static void count() {
        {
            Stack<Integer> stack = new Stack<>();
            for (int i = 1; i <= 5; i++) {
                stack.push(i);
            }
            while (!stack.empty()) {
                System.out.println(stack.pop());
            }
            System.out.println("\nYou will be redirected now, thank you for your patience!");
            System.out.println(" ");
        }
    }
}

