import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    //static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int s = in.nextInt();
      int t = in.nextInt();
      int a = in.nextInt();
      int b = in.nextInt();
      int m = in.nextInt();
      int n = in.nextInt();
      int apples = 0;
      int oranges = 0;
      
      for(int i = 0; i < m; i++) 
      {
        int landingSpot = in.nextInt() + a; // distance from apple tree plus position of apple tree
        if(landingSpot >= s && landingSpot <= t) // length of house 
        { 
          apples++;
        } 

      }
      for(int i = 0; i < n; i++) 
      { 
        int landingSpot = in.nextInt() + b; // distance from orange tree plus position of orange tree
        if(landingSpot >= s && landingSpot <= t) 
        { 
          oranges++; 
        } 
      } 
        System.out.println(apples); 
        System.out.println(oranges); 
  } 
}



