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
    //int high = 0;
    int high = in.nextInt();
    int low = high;
    int HRB = 0;
    int LRB = 0; 
    
    for (int i = 1; i < n; i++)
    {
      int score = in.nextInt();
      if (score > high) 
      {
        high = score;
        HRB++;
      }
      if (score < low)
      {
        low = score;
        LRB++;
      }
    }
    System.out.println(HRB + " " + LRB);
  }
}

    