import java.util.*;
import java.util.Arrays.*;

public class dell {
   public static void main(String[] args) {
      String name = "sanya";
      char target = 's';
      System.out.println(search(name, target));
   }

   static boolean search(String str, char target) {
      if (str.length() == 0) {
         return false;
      }
      for (int i = 0; i < str.length(); i++) {
         if (target == str.charAt(i)) {
            return true;
         }
      }
      return false;
   }
}