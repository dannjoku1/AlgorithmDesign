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
        BigInteger factorial = BigInteger.ONE;

        for (int i=n; i>0; i--){
            BigInteger multiplier = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(multiplier);
        }
        System.out.println(factorial);
    }
}

