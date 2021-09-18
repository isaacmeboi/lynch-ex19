/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise19;

import java.util.Scanner;

 public class solution19 {


        public static void main(String[] args) {
            calcBMI();
        }

        private static void calcBMI() {
            System.out.print("Enter your weight in pounds: ");
            Scanner sc = new Scanner(System.in);
            float w = sc.nextFloat();
            System.out.print("Enter your height in inches: ");
            float h = sc.nextFloat();


            float bmi = (703*w)/(h*h);

            System.out.println("Your BMI is: " + bmi);
            prtBMI(bmi);

        }

        private static void prtBMI(float bmi) {
            if(bmi < 18.5) {
                System.out.println("You are underweight, but that's okay! Get some fiber in ya'!.");
            }

            else if (bmi < 25) {
                System.out.println("You are average, nothing stellar, but not bad!");
            }

            else if (bmi < 30) {
                System.out.println("You are overweight, but no worries. Some exercise and dieting should help!");
            }

            else {
                System.out.println("You are obese, but no worries. Good exercise and dieting should help!");
            }
        }
    }

/*
this one was little bit more difficult for me because i couldn't format it like the rest. this code isn't
like other code, lol. there are two private statics that run the program here rather than the two usual
public voids im comfortable with. the calcBMI private reads in the values from the user and stores them
in floats "w" for weight and "h" for height. then the bmi is calc and stored in a float titled bmi. calcBMI
then prints the bmi and calls the next private prtBMI. prtBMI has the if, else if statements which determines
where your bmi falls. i didn't like how mean the other output were >:[ so i made it nicer :). the main function
then just calls the calcBMI private static since it calls prtBMI within itself.
 */