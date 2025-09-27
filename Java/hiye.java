import java.util.*;
import java.util.Arrays.*;

public class hiye {
   public static void main(String[] args) {
      int[] arr = { 23, 45, 67, 89, 90, 28 };
      System.out.println(max(arr));
   }

   static int max(int[] arr) {
      int ans = arr[0];
      for (int i = 1; i < arr.length; i++) {
         if (arr[i] < ans)
            ans = arr[i];
      }
      return ans;
   }
}