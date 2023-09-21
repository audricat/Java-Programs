import java.util.Scanner;

public class StringRotation {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter input for s: ");
        String goal = scan.next();

        System.out.print("Enter input for goal: ");
        String s = scan.next();

        System.out.println(Rotation(goal, s));
    }

        public static boolean Rotation(String s, String goal) {
        
        if (goal.length() != s.length()) {
            return false;
        }

        StringBuilder checker = new StringBuilder();
        int goalCombi = goal.length() * 3;
        for (int i = 0; i < goalCombi; i++) {
            checker.append(goal);
        }
        
        
        String checkerString = checker.toString(); 
        System.out.println(checkerString);
        if (checkerString.contains(s)) {
            return true;
        } 
        return false;
        }

}
