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
        String S = input.next();

        if(S.isEmpty()){
            System.out.println("0");
            System.exit(0);
        }

        int words = 1;
        for(char letter : S.toCharArray()){
            if(letter < 91 && letter > 64 ){
                words++;
            }
        }
        System.out.println(words);
    }
}
