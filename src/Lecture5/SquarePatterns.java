package Lecture5;
import java.util.Scanner;
//Print the following pattern for the given N number of rows.
//n=4
public class SquarePatterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while (i<=n){
            int j=1;
            while(j<=n){
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
