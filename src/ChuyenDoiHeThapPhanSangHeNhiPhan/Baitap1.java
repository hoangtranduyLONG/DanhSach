package ChuyenDoiHeThapPhanSangHeNhiPhan;

import java.util.Scanner;
import java.util.Stack;
public class Baitap1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi: ");
        String s = "";
        int n = sc.nextInt();
        int n1 = n;
        do {
            stack.push(n % 2);
            n = n / 2;
        } while (n != 0);
        while (!stack.isEmpty()){
            s += stack.pop();
        }
        System.out.println("Số sau khi chuyển sang nhị phân: " + s);

        String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String s1 = "";
        boolean flag = true;
        do {
            int temp = 0;
            for (int i = 1; ;i++) {
                int d = (int) Math.pow(16, i);
                if (d < n1) {
                    temp = d;
                    continue;
                }
                break;
            }
            int a = n1 / temp;
            s1 += arr[a];
            n1 = n1 - temp*a;
            if (n1 <= 15 && n1 >= 0) {
                s1 += arr[n1];
                flag = false;
            }
        } while (flag);
        System.out.println("Số sau khi chuyển sang thập lục phân là: " + s1);
    }
}
