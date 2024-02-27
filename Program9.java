import java.util.*;

public class Program9{

    public static void main(String[] args) {
        // Create a list of numbers with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 5, 6);

        // Use distinct() to remove duplicates
        List<Integer> uniqueNumbers = numbers.stream().distinct().toList();

        // Print the original list and the list of unique numbers
        System.out.println("Original list: " + numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
