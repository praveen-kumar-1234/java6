 // Java code for IntStream.sum() to
// find the sum of elements in IntStream
import java.util.*;
import java.util.stream.IntStream;

    public class Program13 {

        // Driver code
        public static void main(String[] args)
        {
            // Creating an IntStream
            IntStream stream = IntStream.of(2, 4, 6, -2, -4);

            // Using IntStream.sum() to find
            // sum of elements in IntStream
            int sumOfElements = stream.sum();

            // Displaying the calculated sum
            System.out.println(sumOfElements);
        }
    }


