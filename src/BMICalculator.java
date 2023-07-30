/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 1.1
 * File Name: Favorite.java
 */

//Takes the user's weight and height to find the user's BMI

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        int weight, height, BMI;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your weight in lbs: ");
        weight = scan.nextInt();
        
        System.out.println("Enter your height in in: ");
        height = scan.nextInt();
        
        BMI = (weight * 703) / (height * height);
        
        System.out.println("With a height of " + height + " and a weight of " +
                weight + " the user's BMI is " + BMI + ".");
    }
    
}
