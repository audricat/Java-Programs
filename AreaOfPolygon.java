import java.util.*;

public class AreaOfPolygon {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number of sides: ");
            
            int noOfSides = scan.nextInt();

            System.out.println("Enter the side of a regular polygon: ");
            double side = scan.nextDouble();
            
            System.out.println("Area of the regular polygon: " + String.format("%.2f", area(noOfSides, side)));
            
            scan.close();
            }

        public static double area(int n, double side){
            double x = Math.PI / n;

            double area = (n * side * side) / (4 * Math.tan(x));
            
            return area;
        }
    }

