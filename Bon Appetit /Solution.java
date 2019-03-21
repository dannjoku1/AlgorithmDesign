import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//total = [2,4,6]

public class Solution {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int total = 0;
    int notEaten = 0;
    int sum = 0;
    
    for (int i = 0; i < n; i++){
      int b = in.nextInt();
      if (i == k) notEaten = b;
      sum += b;
    }
    total = (sum/2) - (notEaten/2);
    int pay = in.nextInt();
    if (pay == total){
      System.out.println("Bon Appetit");
    } else {
      System.out.println(notEaten/2);
    }
  }
}
