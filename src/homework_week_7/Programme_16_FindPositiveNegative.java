package homework_week_7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        findNumberIsPositiveOrNegativeOrZero(number);
        //Closing the scanner object
        scanner.close();
    }
    //Finding the number is Postive or negative or zero
    public static void findNumberIsPositiveOrNegativeOrZero(int number){
        if (number>0){
            System.out.println(number +" is a POSITIVE number");
        } else if (number <0){
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number +" is ZERO");
        }
    }
}