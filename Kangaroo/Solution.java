import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    //static String kangaroo(int x1, int v1, int x2, int v2) {
  public static void main(String [] args) {
    Scanner in = new Scanner (System.in);
    int x1 = in.nextInt();
    int v1 = in.nextInt();
    int x2 = in.nextInt();
    int v2 = in.nextInt();
    
    
    while (x1 <= x2 )
    {
      if (x1 == x2)
      {
        System.out.print("YES");
        System.exit(0);
      }
      x1 += v1;
      x2 += v2;
    }
    System.out.println("NO");
  }
}
