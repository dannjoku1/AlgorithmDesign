/*

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21

*/

public class Solution {
    public int reverse(int x) {
        if(x < 0){ // if statement for when x is a negative 
            return -numToString(-x);
        }
        if(x < 10){ // if x is a single digit int, then return the int
            return x;
        }
        return numToString(x); // return the result of the numToString method
    }
    public int numToString(long x){
        String s = x+"";
        s = new StringBuilder(s).reverse().toString(); // class used to reverse string
        int result;
        try{
            result =  Integer.parseInt(s);
        }catch(Exception e){
            return 0;
        }
        return result;
    }
}