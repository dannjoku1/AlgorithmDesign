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
  
    static String dayOfTheProgrammer(int year) {
      String date = "";
      if ( year < 1918 ) {
        date += ( year % 4 == 0 ) ? "12.09." + year : "13.09." + year;
      } else if ( year == 1918 ){
        date += "26.09." + year;
      } else {
        date += ( year % 400 == 0 ) || 
        ( year % 4 == 0 && year % 100 != 0 ) ? "12.09." + year : "13.09." + year;
      }
      return date;
    }

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int year = in.nextInt();
      String result = dayOfTheProgrammer(year);
      System.out.println(result);
    }
}


  