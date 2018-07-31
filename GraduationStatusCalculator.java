// Graduation Status Determination
// by Alex Allen for CSCI 111

package graduationstatuscalculator;

import java.util.*;

public class GraduationStatusCalculator 
{

    public enum Status          // enum inner class declaration 
        { SCL, MCL, CL, ELIGIBLE, INELIGIBLE, ERROR }   

    /* the main method displays the graduation status, based on the value
     * of the variable gpa, which is related to the enumerated type Status.
     */
    public static void main(String[] args) {
        String studentName; // student's name (string)
        double gpa;         // student's GPA
        
        Status graduation;  // declare variable
                
        // declare an instance of scanner to capture data from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // get student name
        System.out.println("Please enter the student's first name:" );
        studentName = keyboard.next();
                
        // get student's GPA
        System.out.println("Please enter " + studentName + "'s GPA.");
        gpa = keyboard.nextDouble();
        
        // determine student's graduation status
        if ((gpa > 4.0) || (gpa < 0.0))
            graduation = Status.ERROR;
        else if (gpa < 2.0)
            graduation = Status.INELIGIBLE;
        else if ((gpa >= 3.2) && (gpa < 3.6))
            graduation = Status.CL;
        else if ((gpa >= 3.6) && (gpa <= 3.8))
            graduation = Status.MCL;
        else if ((gpa >= 3.8) && (gpa <= 4.0))
            graduation = Status.SCL;
        else if (gpa >= 2.0)
            graduation = Status.ELIGIBLE;
        else graduation = Status.ERROR;

       // Announce student's graduation status.
        System.out.print(studentName + "'s graduation status is ");
        
        switch (graduation)
            {
            case SCL:           System.out.println("eligible with Summa Cum Laude distinction.");
                                break;
            case MCL:           System.out.println("eligible with Magna Cum Laude distinction.");
                                break;
            case CL:            System.out.println("eligible with Cum Laude distinction.");
                                break;
            case ELIGIBLE:      System.out.println("eligible.");
                                break;
            case INELIGIBLE:    System.out.println("ineligible.");
                                break;
            case ERROR:         System.out.println("not calcuable based on the GPA entered. Please enter a valid GPA between 0.0 and 4.0.");
                                break;
            default:            System.out.println("not calcuable based on the GPA entered. Please enter a valid GPA between 0.0 and 4.0.");
        }

    }

}