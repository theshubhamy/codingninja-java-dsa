// Print the following pattern
// Pattern for N = 4
//    *
//   ***
//  *****
// *******
// The dots represent spaces.
// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rows = 1;
        while(rows<=n) {
            int spaces = 1;

            while(spaces<=n-rows) {
                System.out.print(' ');
                spaces++;
            }

            int increasing = 1;
            while(increasing<=rows) {
                System.out.print('*');
                increasing++;
            }
            
            int decreasing = rows-1;
            while(decreasing>=1) {
                System.out.print('*');
                decreasing--;
            }
            System.out.println();
            rows++;
        }

		
	}

}
