    /* 
      *The following is a solution for an assignment question
      *The solution has been explained code by code
      *It ouputs after gathering and inputing user inputs
    */
import java.util.Scanner;
    // Importing scanner
class CalculateG {

    // Multiplication of two numbers method
    public static double multiplication(double numX, double numY) {
        return numX * numY;
    }

    // Squere method
    public static double square(double numX) {
        return numX * numX;
    }

    // Summation method
    public static double summation(double numX, double numY) {
        return numX + numY;
    }

    // OutPut method
    public static void outline(String message, double result) {
        System.out.println("message" + result);
    }
    // message to be displayed is inside the quotation marks

    // main method
    public static void main(String[] arguments) {

        // New scanner screation and naming
        Scanner input = new Scanner(System.in);

        /*
          *The begining of the velocity question
          *The Variables are a provided in the question
          *each line of code is explained
        */
        
        double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        // The formulae for position and velocity
        // 𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
        finalPosition = (0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition)
                / fallingTime;
        // 𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖
        finalVelocity = (gravity * fallingTime + initialVelocity) / fallingTime;

        // Printing out the output 
        // Outputs the falling time 
        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
        // Outputs the final velocity
        System.out.println("The object's velocity after " + fallingTime + " seconds is "
                + finalVelocity + " m/s");


        // variables to store user input
        double firstNum, secondNum;

        // Gathering the users input
        System.out.println("Enter the first number");
        firstNum = input.nextDouble();
        System.out.println("Enter the second number");
        secondNum = input.nextDouble();

        // creating and declaring variables 
        double multiplicationResult = multiplication(firstNum, secondNum);
        double squareResult1 = square(firstNum);
        double squareResult2 = square(secondNum);
        double summationResult = summation(firstNum, secondNum);

        // Calling methods created beore to print out results
        outline("Multiplication result: ", multiplicationResult);
        outline("Square result for " + firstNum + " is :", squareResult1);
        outline("Square result for " + secondNum + " is :", squareResult2);
        outline("Summation result: ", summationResult);
    }
}
