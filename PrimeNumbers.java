import java.util.*;

public class PrimeNumbers {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int input = scan.nextInt();

        boolean isPrime = checkPrime(input);
        if (isPrime) {
           System.out.println(input + " is a Prime Number.");
        } else {
           System.out.println(input + " is NOT a Prime Number.");
        }
        
        scan.close();
        
         System.out.println("Prime Numbers: ");
         printPrime();
    }

        public static boolean checkPrime(int input) {
            for (int i = 2; i < Math.sqrt(input); i++) {
                 if (input % i == 0) {
                    return false;
                  }
           }
                  return true;
        }

        public static void printPrime() {
            for (int i = 2; i <= 100; i++) {
                if (checkPrime(i) == true) {
                    System.out.print(i + " ");
                }
            }
        }
    }
