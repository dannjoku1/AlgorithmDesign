import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr, int n) {
    double f1 = 0.0, f2 = 0.0, f3 = 0.0;
      
    for (int i = 0; i < n; i++) {
      if (arr[i] > 0){
        f1+=1;
      }else if (arr[i] < 0){
        f2+=1;
      } else {
        f3+=1; 
      }
    }
    System.out.println(f1/n);
    System.out.println(f2/n);
    System.out.println(f3/n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr, n);

        scanner.close();
    }
}
