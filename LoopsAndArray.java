
public class LoopsAndArray {
    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 2, 4, 6, 8, 10 }
        };

        calculateSum(arr);

//       Initialization condition incrementation
//                     3 < 3
//        for(int i = 0; i < 3; i++) {
////            Code block
//            System.out.println("Value of i: " + i); // 2
//            System.out.println("Hello World");
//        }

//        int i = 0;

//            5 < 3
//        while(i < 3) {
//            System.out.println("Value of i: " + i);
//            System.out.println("Hello World");
//            i++;
//        }

//        do {
//            System.out.println("Value of i: " + i);
//            System.out.println("Hello World");
//            i++;
//        } while(i < 3);

//        String dayOne  = "Monday";
//        String dayTwo  = "Tuesday";
//        String dayThree  = "Wednesday";
//        String dayFour  = "Thursday";
//        String dayFive  = "Friday";
//        String daySix  = "Saturday";
//        String daySeven  = "Sunday";

//        index -> 0

//
//        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
//
//////        .length -> 1
////
////        System.out.println(days[0]);
////        System.out.println(days[1]);
////        System.out.println(days[2]);
////        System.out.println(days[3]);
////        System.out.println(days[4]);
////        System.out.println(days[5]);
////        System.out.println(days[6]);
//
//
//
//        for(int i = 0; i < days.length; i++) {
////            System.out.print("days[" + i + "]: " );
//            System.out.println(days[i]);
//        }

    }

    public static void calculateSum(int[][] arr)
    {
        int sum = 0;

        for(int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                sum += arr[row][column];
            }
            System.out.println("Sum of array " + (row + 1) + ": " + sum);
            sum = 0;
        }


    }
}