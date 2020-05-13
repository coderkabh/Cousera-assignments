package week1solutions.task1;

import java.util.Scanner;
import java.util.Stack;

public class assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length() ; i++) {
            if (string.charAt(i) == '{' || string.charAt(i) == '(' || string.charAt(i) == '['){
                stack.push(string.charAt(i));
            }

            if(string.charAt(i) == '}'){
                if(stack.pop() == '{'){
                    continue;
                }else break;
            }

            if(string.charAt(i) == ']'){
                if(stack.pop() == '['){
                    continue;
                }else break;
            }

            if(string.charAt(i) == ')'){
                if(stack.pop() == '('){
                    continue;
                }else break;
            }

        }
        if(stack.isEmpty()) System.out.println("Yes");
        else System.out.println("No");
    }
}