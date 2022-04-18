package PalindromeQueue;
import java.util.*;
public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine().toLowerCase();
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String[] arr = str.split("");
        for (String i : arr) {
            queue.add(i);
            stack.push(i);
        }
        String strStack = "";
        String strQueue = "";
        while (!stack.isEmpty()){
            strQueue += queue.remove();
            strStack += stack.pop();
        }
        if (strStack.equals(strQueue)) {
            System.out.println("Chuỗi " + str + " là Palindrome");
        } else {
            System.out.println("Chuỗi " + str + " không là Palindrome");
        }
    }
}
