/*

If a[i] > b[i] , then Alice is awarded 1 point.
if a[i] < b[i] , the Bob is awarded 1 point. 
if a[i] = b[i] , then neither person receives a point.

SAMPLE INPUT 
5 6 7
3 6 10

SAMPLE OUTPUT 
1 1 
*/ 

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

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        int alice = 0;
        int bob = 0;
        
        List<Integer> win = new LinkedList<Integer>();
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i))
                    ++alice;
                else if (a.get(i) < b.get(i))
                    ++bob;

            }
            win.add(alice);
            win.add(bob);
            return win;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}