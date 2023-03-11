import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static long retunrFib(int n) { //Function to find the nth term of the Fibonacci Series
        if(n == 0) {
            return 0;
        }
        else {
            long first = 0;
            long second = 1;
            long third = 0;
            for(int i = 1; i < n; i++) {
                third = first + second;
                first = second;
                second = third;
            }
            return third;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t < 1 || t > 100000){ //Test case constraint
            System.exit(0);
        }
        
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            
            if(n < 10 ||n > 400000000000000000l){ //n value constraint
                System.exit(0);
            }
            
            long third = 0;
            long evenSum = 0;
            
            for(int i = 3; third <= n; i += 3){ //Every 3rd term in the Fibonacci Series is an even number
                evenSum += third;
                third = returnFib(i); //Holds every third term in the Fibonacci Series
            }
            System.out.println(evenSum);
        }
    }
}
