/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz2;

/**
 *
 * @author Lecturer
 */
import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // ask for a number between 1 and 150
            System.out.print("Please type a number between 1 and 150: ");
            int number = scanner.nextInt();
            
            
            // verifies if the number is between 1 and 150
            if (number >= 1 && number <= 150) {
                // verifies if the number is divided by 3 and 5
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // verifies if the number is divided by 3
                else if (number % 3 == 0) {
                    System.out.println("Fizz");
                }
                // verifies if the number is divided by 5
                else if (number % 5 == 0) {
                    System.out.println("Buzz");
                }
                // if its not divided by any
                else {
                    System.out.println("Your number is not divided by any.");
                }
                break; 
            } 
            scanner.close();
        }
        
    }
}

