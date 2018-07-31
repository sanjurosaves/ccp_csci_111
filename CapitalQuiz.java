// State Capital Quiz App
// by Alex Allen for CSCI 111

package capitalquiz;
import java.io.*;
import java.util.Scanner;

public class CapitalQuiz {

    public static void main(String[] args) throws Exception { 
        String [] array1 = new String[50];
        String [] array2 = new String [50];
        int pos = 0;
        // Create a File class object x and give it the name of the file to read 
        File x = new File("capitals.txt"); 

        // Create a Scanner named y to read the input stream from the file x 
        Scanner y = new Scanner(x); 

        // Read a line of text from the file 
        while (y.hasNext())
                {

           array1[pos] = y.nextLine();

           array2[pos] = y.nextLine();

           pos ++;

        // Close the input data stream and associated file 
                }
        y.close();
        
        searchStates(array1, array2);
} // end main()

    static public void searchStates(String [] a1, String [] a2)
        throws Exception {
     String target;         // the state for which we are searching
     int n;                 // loop counter
     boolean found = false; // true if the target state is found in the array

     // set up input stream from the keyboard  
     Scanner keyboard = new Scanner(System.in);   

     // get the target name of the state from the user
     System.out.print("Please enter the name of a state: " );  
     target = keyboard.nextLine();

     // search array of states for target state
     // the loop coninues to the end of the array if the state is not found  
     for (n=0; (!found) && (n < a1.length) ; n++) 
     {
         if (a1[n].matches(target) )
          {
              //print found message and set found to true
              System.out.println("The capital of " + target + " is " + a2[n] + ". \n");
              found = true;
          } // end if

      } // for loop

     // after the loop – if not(found) print not found message
     if (!found)
         System.out.println(target + " is not in the array of states. \n");
 
}
    
    }