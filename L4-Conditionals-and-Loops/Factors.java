// Write a program that takes a number as input and prints all its factors. If the number has only two factors (1 and the number itself), then the program should print -1.
// Input Format :
// A single integer, n
// Output Format :
// All the factors of n excluding 1 and the number itself
// Constraints :
// 0 <= n <= 10,000
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int i=2;
        while(i<=num/2) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i=i+1;
        }

        System.out.println("No output as "+num+" is prime having factors as 1 and "+num+" only");

    }
}
