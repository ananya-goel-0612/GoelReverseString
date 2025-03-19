import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    private String myString;
    private Stack<Character> stack;

    public Reverse(String string) {
        this.myString = string;
        stack = new Stack<Character>();
    }

    public ArrayList<Character> reverseString() {
        for (int i = 0, j = this.myString.length(); i < j; i++) {
            stack.push(this.myString.charAt(i));
        }

        ArrayList<Character> reversed = new ArrayList<Character>();

        while (!stack.empty()) {
            reversed.add(stack.pop());
        }

        return reversed;

    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = s.nextLine();

        Reverse r = new Reverse(string);
        ArrayList<Character> reversed = r.reverseString();

        for (Character c : reversed) {
            System.out.print(c);
        }
    }
}
