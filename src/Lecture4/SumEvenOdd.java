package assignments;
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
