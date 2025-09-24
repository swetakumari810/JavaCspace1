import java.util.*;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to stop):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                // String parsing -> int -> Autoboxing to Integer
                int num = Integer.parseInt(input);
                numbers.add(num); // autoboxing happens here
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, enter integers only.");
            }
        }

        int sum = 0;
        // Enhanced for-loop -> unboxing happens here
        for (Integer n : numbers) {
            sum += n; 
        }

        System.out.println("The sum of entered integers: " + sum);
        sc.close();
    }
}
