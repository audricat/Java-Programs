import java.util.*;

  // input is divisible by 3 => print Fizz
    // if number is divisible by 5 => print Buzz
    // if number is divisible by 3 and 5 => print FizzBuzz

//Time complexity: O(1) constant

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number divisible by 3 and/or 5: ");

        int num = scan.nextInt();


       printFizzBuzz(num);        
       scan.close();
    }

    public static void printFizzBuzz(int num) {
        if (num % 3 == 0) {
            if (num % 5 == 0) {
            System.out.println("FizzBuzz");
            }
            else {
            System.out.println("Fizz");
            }
        }
        else if(num % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println("Wrong Input");
        }
    }
}
