import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] inputLine = new int[n];
        for (int a = 0; a < n; a++) {
                inputLine[a] = input.nextInt();
            }

        int swap=0;

        for(int i=0;i<n;i++){
            if(i+1!=inputLine[i]){
                int t=i;
                while(inputLine[t]!=i+1){
                    t++;  
                }
                int temp=inputLine[t];
                inputLine[t]=inputLine[i];
                inputLine[i]=temp;
                swap++;
            }
        }
        System.out.println(swap);
    }
}