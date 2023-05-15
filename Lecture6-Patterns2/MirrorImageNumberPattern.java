// Print the following pattern for the given N number of rows.
// Pattern for N = 4
//    1
//   12
//  123
// 1234
// The dots represent spaces.
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n) {
            int numbers = 1;
            int spaces = 1;
            while(spaces <= n-i) {
                System.out.print(' ');
                spaces++;
            }
            while(numbers<=i) {
                System.out.print(numbers);
                numbers++;
            }
            System.out.println();
            i++;
        }
		
	}

}