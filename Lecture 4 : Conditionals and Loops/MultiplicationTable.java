// Write a program to print multiplication table of n
// Input Format :
// A single integer, n
// Output Format :
// First 10 multiples of n each printed in new line
// Constraints :
// 0 <= n <= 10,000
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
    }
}
