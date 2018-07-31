// International Gymnastics Scoring
// by Alex Allen for CSCI 111

package gymnasticsscoring;

import java.util.*;

public class GymnasticsScoring {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
            
    {
     double[] individualJudgeScore = new double[6];  // this is the array to hold 6 numbers
     
       java.util.Scanner input = new java.util.Scanner(System.in);
    
//  This loop prompts the user for the each judge's score and enters the floating point numbers in an array 
    for (int i = 0; i < individualJudgeScore.length; i++)
        {
         System.out.print("Score for Judge " + (i + 1) + ": ");
         individualJudgeScore[i] = input.nextDouble();
        }
    System.out.print("\n");
    
    double total = 0;  // is the accumulator that will total all numbers 
        
 //  This loop adds the numbers entered in array to the total variable
    for (int i = 0; i < individualJudgeScore.length; i++)
        { // Second Loop Begin
         total = total + individualJudgeScore[i];
                 
        }  // Second Loop End 
    
    // call method to calculate and output average score
    calculateScore(total, individualJudgeScore.length);
    }
 // end main()
    
/******************************************************************************/

/* This method calulates the average score by dividing the total score by the
    * number of judges. It has two parameters,
    *       the aggregate total of all the judge's scores   double totalScore
    *       the number of judges                            int numberofJudges
    */    
        
    public static void calculateScore(double totalScore, int numberOfJudges)
      {
    
        System.out.print
            ("The average score is: ");
        System.out.printf("%5.2f", totalScore / numberOfJudges);
        System.out.print("\n");
      } // end calculateScore
    
} // end class
