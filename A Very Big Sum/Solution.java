import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) { 
      Scanner in = new Scanner(System.in); 
      int n = in.nextInt();
      long total = 0;
      
      for (int i = 0; i < n; i++){
        int curr = in.nextInt();
        total += curr;
      }
      System.out.println(total);
    }
}