public class CountVowels {
    public static void main(String[] args) {
        String input = " hi thEre";
        String input2 = "happy NEw YeAr";

        Count(input);
        Count(input2);
        }

        public static void Count(String input) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] arr = input.toCharArray();

        int countVowels = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toLowerCase(arr[i]);
            for (int j = 0; j < vowels.length; j++)
                if (arr[i] == vowels[j]) {
                    countVowels++;
                }
            }
            
            System.out.println("Number of Vowels in input: " + countVowels);
        }
    }

