package assignments;
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
