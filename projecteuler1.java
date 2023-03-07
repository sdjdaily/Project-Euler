import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t < 1 || t > 100000){ //Test case constraint
            System.exit(0);
        }
        
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            if(n < 1 || n > Integer.MAX_VALUE){ //Checking if n is in range
                System.exit(0);
            }
            n--;
            
            long by3 = n/3;
            long by5 = n/5;
            long by15 = n/15;
            
            long mulOf3 = 3 * (by3 * (by3 + 1));      //Sum of consecutive numbers from 1 - 'by3' multiplied by 3
            long mulOf5 = 5 * (by5 * (by5 + 1));      //Sum of consecutive numbers from 1 - 'by5' multiplied by 5
            long mulOf15 = 15 * (by15 * (by15 + 1));  //Sum of consecutive numbers from 1 - 'by15' multiplied by 15
            
            long result = (mulOf3 + mulOf5 - mulOf15)/2;
            System.out.println(result);
            
        }
        in.close();
    }
    
}
