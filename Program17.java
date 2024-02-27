import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Program17 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Reduction - sum
        int sum = IntStream.of(numbers).sum();
        System.out.println("Sum of elements: " + sum);

        // Reduction - summary statistics
        IntSummaryStatistics stats = IntStream.of(numbers).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
    }
}



