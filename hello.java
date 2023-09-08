import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds;
        while (true) {
            try {
                System.out.print("Enter the number of seconds: ");
                seconds = Integer.parseInt(scanner.nextLine());
                scanner.close();
                if (seconds >= 0) {
                    break;
                }
                System.out.println("Invalid input! Seconds must be non-negative.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int finalSeconds = remainingSeconds % 60;

        System.out.println(hours + ":"+minutes+":"+finalSeconds);
    }
}