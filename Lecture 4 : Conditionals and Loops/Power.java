// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
// Note : For this question, you can assume that 0 raised to the power of 0 is 1


// Input format :
// Two integers x and n (separated by space)
// Output Format :
// x^n (i.e. x raise to the power n)
// Constraints:
// 0 <= x <= 8 
// 0 <= n <= 9
import java.util.Scanner;
public class Power {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*x;
        }
        System.out.println(p);

    }
}
