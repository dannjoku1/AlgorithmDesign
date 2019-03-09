import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    //static int[] gradingStudents(int[] grades) {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      for (int i = 0; i < n; i++) { 
        int grade = input.nextInt();
        
        int newGrade = ((grade / 5) + 1) * 5;
        
        if (newGrade < 40){
          System.out.println(grade);
          continue;
        }
        if (newGrade - grade < 3) {
          System.out.println(newGrade);
        } else 
          System.out.println(grade);
      }
    }
}

  