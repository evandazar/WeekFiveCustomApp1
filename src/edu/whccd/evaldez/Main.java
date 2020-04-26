package edu.whccd.evaldez;

import java.util.Scanner;
/*
    The purpose of this program is to show the benefits of using methods.
    Author: Evander Valdez
*/
public class Main {

    //display inputs as strings
    static void displayString(String input){
        System.out.println(input);
    }

    //Validate input as an integer
    static boolean isValid(int input, int lowerBound, int upperBound){
    displayString("This method validates if an integer input is within acceptable range");
    boolean output = false;
    if (input >= lowerBound && input <= upperBound)
    {
        output = true;
        displayString(input + " is within range");
    }
    else
    {
        displayString(input + " is NOT within range");
    }
    return output;
    }

    //Validate input as a double.
    static boolean isValid(double input, double lowerBound, double upperBound){
        displayString("This method validates if an double input is within acceptable range");
        boolean output = false;
        if (input >= lowerBound && input <= upperBound)
        {
            output = true;
            displayString(input + " is within range");
        }
        else
        {
            displayString(input + " is NOT within range");
        }
        return output;
    }

    public static void main(String[] args) {

    //Initialize Variables
    int lowerBound = 100;
    int upperBound = 1000;
    Scanner sc = new Scanner(System.in);

    boolean isValidIntegerInput = false;
    boolean isValidDoubleInput = false;

    //Integer Validation loop
    do {
        displayString("Enter an Integer (100-1000):");
        int userInput = 0;
    userInput = sc.nextInt();
    isValidIntegerInput = isValid(userInput, lowerBound, upperBound);
    } while (!isValidIntegerInput);

    //Double Validation loop
    do {
    displayString("Enter a Double (100-1000):");
    double userInput = 0;
    userInput = sc.nextDouble();
    isValidDoubleInput = isValid(userInput, lowerBound, upperBound);
    } while (!isValidDoubleInput);
    }
}
