// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf
// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
// Round off the total salary and then print the integral part only.
// Note for C++ users :
// To round off the value , please include<cmath> library in the start of the program.
// And round off the values in this way 
// int ans = round(yourFinalValue);
// Input format :
// Basic salary & Grade (separated by space)
// Output Format :
// Total Salary
// Constraints :
// 0 <= Basic Salary <= 7,500,000
import java.util.Scanner;
public class TotalSalary {
    /*
     totalSalary = basic + hra + da + allow – pf
    hra   = 20% of basic
    da = 50% of basic
    allow = 1700 if grade = ‘A’
    allow = 1500 if grade = ‘B’
    allow = 1300 if grade = ‘C' or any other character
    pf = 11% of basic.
    */

    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        double basic=s.nextDouble();
        char grade=s.next().charAt(0);
        Character.toUpperCase(grade);
        double hra =basic*20/100;
        double da=basic*50/100;
        int allow=0;
        if(grade=='A'){
            allow=1700;}
        else if(grade=='B'){
            allow=1500;}
        else {
            allow=1300;
            //System.out.println(allow);
        }

        double pf=basic*11/100;
        double Salary= (double)basic+hra+da+allow-pf;
        double totalSalary=Salary-(int)Salary;
        if(totalSalary<0.5)
            System.out.println((int)Salary);
        else
            System.out.println((int)Salary+1);
    }
}
