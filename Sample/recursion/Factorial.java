package Sample.recursion;

/*
 * Illustrates the recursive definition of 
 *      the factorial funciton
 * 
 * @author William Goble
 * @author Dickinson College
 */

public class Factorial {
   /*
	 * We know that fact(n) = n * (n - 1) * (n - 2) * ... * 1
	 * Which can be written recursively as fact(n) = n * fact(n - 1)
	 * Remember: when writing recursive functions we want to identify 
	 * the base case first, and then combine the base case with the 
	 * results from a similar subproblem. 
	 */
    public static int fact(int n) {
        return 0;
    }
    
     public static void main(String[] args) {
        int outcome = fact(0);
        String result = String.format("Result of 5!: %d", outcome);
        System.out.println(result);
     }
}
