import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        /* Save interval endpoints' "k" values in array */
        long [] array = new long[n + 1];
        while (m-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int k = input.nextInt();
            array[a-1] += k;
            array[b]   -= k; 
        }
        input.close();
        
        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}