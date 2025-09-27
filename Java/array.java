import java.util.*;
import java.io.*;

public class array Sum
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects: ");
        int marks[] = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        System.out.println("The sum is: " + sum);
    }
}