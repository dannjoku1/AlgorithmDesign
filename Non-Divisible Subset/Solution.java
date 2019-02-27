import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        int[] remainders = new int[k];
        for (int i = 0; i < n; i++) {
            int ai = input.nextInt();
            remainders[ai % k]++;
        }

        int result = 0;
        for (int i = 0; i * 2 <= k; i++) {
            int opposite = (k - i) % k;
            if (i == opposite) {
                result += Math.min(remainders[i], 1);
            } else {
                result += Math.max(remainders[i], remainders[opposite]);
            }
        }
        System.out.println(result);
        input.close();
    }
}