// Write a program to print triangle of user defined integers sum.
//  Pattern for N = 3
// 1=1
// 1+2=3
// 1+2+3=6
// Input Format :
// A single integer, N
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
        int currentRow = 1;
        int sum = 0;

        while (currentRow <= n) {
            sum = sum + currentRow;
            int currentCol = 1;
            while(currentCol <= currentRow)
            {
                System.out.print(currentCol);
                if(currentCol == currentRow) {
                    System.out.print('=');
                }else {
                    System.out.print('+');
                }
                currentCol++;

            }

            System.out.println(sum);
            currentRow++;
        }
	}
}
