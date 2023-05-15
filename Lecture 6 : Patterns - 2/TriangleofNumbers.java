// Print the following pattern for the given number of rows.
// Pattern for N = 4

//    1
//   232
//  34543
// 4567654

// The dots represent spaces.
// Input format :
// Integer N (Total no. of rows)
// Output format :
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = 1;
        while(rows<=n) {
            int spaces = 1;
            //1st loop for spaces
            while(spaces<=n-rows) {
                System.out.print(' ');
                spaces++;
            }
            
            int increasing = 1;
            int printValueLeft = rows;
            while(increasing<=rows) {
                System.out.print(printValueLeft);
                printValueLeft++;
                increasing++;
            }

            int decreasing = rows-1;
            int printValueRight = printValueLeft - 2;
            while(decreasing>=1) {
                System.out.print(printValueRight);
                printValueRight--;
                decreasing--;
            }
            System.out.println();
            rows++;
        }
	}
}
