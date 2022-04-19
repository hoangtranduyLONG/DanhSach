package DemSoLanXuatHienMoiTu;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class DemSoLan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase().trim();
        Map<String, Integer> map = new TreeMap<String, Integer>();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            boolean flag = false;
            if (i == 0) {
                map.put(arr[i], 1);
                continue;
            }
            for (String j : map.keySet()) {
                if (arr[i].equals(j))  {
                    map.replace(arr[i], map.get(arr[i]) + 1);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                map.put(arr[i], 1);
            }
        }
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
