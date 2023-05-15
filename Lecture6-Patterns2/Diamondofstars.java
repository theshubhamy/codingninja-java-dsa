// Print the following pattern for the given number of rows.
// Note: N is always odd.

// Pattern for N = 5

//   *
//  ***
// *****
//  ***
//   *

// The dots represent spaces.

// Input format :
// N (Total no. of rows and can only be odd)
// Output format :
// Pattern in N lines
// Constraints :
// 1 <= N <= 49

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
                Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int firstHalf=(n+1)/2;
        int secondHalf = n - firstHalf;

        
        int currRow = 1;
        while(currRow<=firstHalf)
        {
            
            int spaces = 1;
            while(spaces <= firstHalf-currRow) {
                System.out.print(' ');
                spaces++;
            }
            
            int currCol = 1;
            while(currCol<=2*currRow-1) {
                System.out.print('*');
                currCol++;
            }

            System.out.println();
            currRow++;
        }
        currRow=secondHalf;
        
        while(currRow>=1) {
            
            int spaces = 1;
            while(spaces<=secondHalf-currRow+1) {
                System.out.print(' ');
                spaces++;
            }
            
            int currCol = 1;
            while(currCol<=2*currRow-1) {
                System.out.print('*');
                currCol++;
            }
            System.out.println();
            currRow--;
        }
        
    }
}