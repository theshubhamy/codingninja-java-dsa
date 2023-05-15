// Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
// Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
// Input format :
//  Integer N
// Output format :
// Sum_of_Even_Digits Sum_of_Odd_Digits
// (Print first even sum and then odd sum separated by space)
// Constraints
// 0 <= N <= 10^8
import java.util.Scanner;
public class SumEvenOdd {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int sumEven=0;
        int sumOdd=0;
        while(num!=0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                sumEven=sumEven+rem;
            }
            else
            {
                sumOdd=sumOdd+rem;
            }

            num=num/10;


        }
        System.out.println(sumEven+" "+sumOdd);


    }
}
