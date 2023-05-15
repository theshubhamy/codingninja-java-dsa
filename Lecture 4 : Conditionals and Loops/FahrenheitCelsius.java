// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
// Input Format :
// 3 integers - S, E and W respectively 
// Output Format :
// Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. The Fahrenheit value and its corresponding Celsius value should be separate by single space.
// Constraints :
// 0 <= S <= 90
// S <= E <=  900
// 0 <= W <= 80 
import java.util.Scanner;
public class FahrenheitCelsius {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int E=sc.nextInt();
        int W=sc.nextInt();
        int C;
        while(S<=E){
            C=5*(S-32)/9;
            System.out.println(S+" "+C);
            S=S+W;
        }

    }
}
