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

        for(int i=0; i<n; i++){
            for(int x=0; x<n-1-i; x++){
                System.out.print(' ');
            }
            for (int y = 0; y < 1 + i; y++){ 
                System.out.print("#");
            }
            System.out.println();
        }
    }
}