import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
A left rotation operation on an array shifts each of the array's elements 1 unit to the left. 
For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2].
*/ 

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            if(n > i) 
                arr[size - n + i] = in.nextInt();
            else
                arr[i - n] = in.nextInt();
        }
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}

