package DaoNguocPhanTuSoNguyen;
import java.util.Scanner;
import java.util.Stack;
public class SoNguyen {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String n = sc.nextLine();
        for (String i : n.toString().split("")) {
            stack.push(i);
        }
        n = "";
        System.out.println(stack);
        while (!stack.isEmpty()){
            n += stack.pop();
        }
        System.out.println("reverse string: " + n);
    }
}
