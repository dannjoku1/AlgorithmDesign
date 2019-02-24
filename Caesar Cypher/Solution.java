import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int k = input.nextInt() % 26;
        StringBuilder output = new StringBuilder("");

        for(char letter : s.toCharArray()){
            if(letter > 64 && letter < 91){
                char encrypted = (char) (letter+k);
                if(encrypted > 90){
                    encrypted = (char) ((encrypted % 90) + 64);
                }
                output.append(encrypted);
            }
            else if(letter > 96 && letter < 123){
                char encrypted = (char) (letter+k);
                if(encrypted > 122){
                    encrypted = (char) ((encrypted % 122) + 96);
                }
                output.append(encrypted);
            } else {
                output.append(letter);
            }
        }
        System.out.println(output);
    }
}