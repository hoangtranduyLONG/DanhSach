package DaoNguocPhanTuSoNguyen;
import java.util.Scanner;
import java.util.Stack;
public class SoNguyen {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        for (String i : s.toString().split("")) {
            stack.push(i);
        }
        s = "";
        System.out.println(stack);
        while (!stack.isEmpty()){
            s += stack.pop();
        }
        System.out.println("Chuỗi sau khi đảo ngược: " + s);
    }
}
