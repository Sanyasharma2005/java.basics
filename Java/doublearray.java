import java.util.Arrays;
import java.util.*;

public class doublearray {
    public static void main(String[] args) {
        int[] arr = { 100, 20, 53, 40, 34, 77, 55 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
