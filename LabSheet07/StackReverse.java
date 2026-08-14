import java.util.ArrayDeque;
import java.util.Deque;

public class StackReverse {

    public static void main(String[] args) {
        String original = "Hello World";

        System.out.println("Original => " + original);

        String reversed = reverseCharacter(original);
        System.out.println("Reverse  => " + reversed);
    }

    public static String reverseCharacter(String original) {
        Deque<Character> stack = new ArrayDeque<Character>();


        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }


        String reversedString = "";


        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        return reversedString;
    }
}