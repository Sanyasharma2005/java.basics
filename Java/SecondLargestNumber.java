import java.util.*;
import java.util.Arrays.*;

public class SecondLargestNumber {
    /*
     * int arr[] = { 23, 45, 67, 89, 63, 11, 5 };
     * int x = 76;
     * boolean flag = false;
     * for (int i = 0; i < arr.length; i++) {
     * if (arr[i] == x) {
     * flag = true;
     * break;
     * }
     * }
     * if (flag == false)
     * System.out.println("noi mil gaya");
     * else
     * System.out.println("  mila");
     * 
     * }}
     */
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int arr[] = { 4, 6, 8, 9, -23, 67 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max)
                smax = arr[i];
        }
        System.out.println(max);
    }
}
