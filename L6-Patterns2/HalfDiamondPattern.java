// Write a program to print N number of rows for Half Diamond pattern using stars and numbers
// Note : There are no spaces between the characters in a single line.
// Pattern for N = 3
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *
// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("*"); //for 1st star

        int currRow = 1;
        while(currRow <= n) {
            System.out.print("*"); //first star
            int currCol = 1;
            
            while(currCol <= currRow) {
                System.out.print(currCol);
                currCol += 1;

            }

            currCol = currCol - 2;
            while(currCol>=1) {
                System.out.print(currCol);
                currCol -= 1;

            }
            System.out.println("*");
            currRow += 1;
        }

        currRow = 1;
        while(currRow<=n-1) {
            System.out.print("*");
            int currCol = 1;

            while(currCol <= n-currRow) {
                System.out.print(currCol);
                currCol++;
            }

            currCol = currCol - 2;
            while(currCol >= 1) {
                System.out.print(currCol);
                currCol -= 1;
            }
            System.out.println("*");
            currRow += 1;

        }
        System.out.print("*");
    }
}