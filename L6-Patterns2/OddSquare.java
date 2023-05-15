// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135
// Input Format :
// A single integer: N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
                Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int currRows = 1;
        while (currRows <= n) {
            int printValue = 2*currRows -1;
            int currCol = 1;
            while(currCol<=n) {
                System.out.print(printValue);
                printValue = printValue + 2;
                if(printValue > 2*n -1) {
                    printValue = 1;
                }
                currCol++;
            }
            System.out.println();
            currRows++;
        }
	}
}
