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

public class Solution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] types = new int[5];
    for (int i = 0; i < n; i++){
      int type = input.nextInt()-1;
      types[type] = types[type] +1;
    }
    int max = 0;
      int index = 0;
      for (int i = 0; i < 5; i++){
        if (types[i] > max){
          max = types[i];x
          index = i;
        }
      }
      System.out.println(index+1);
  }
}
