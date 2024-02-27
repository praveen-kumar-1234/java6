 // Java code for IntStream skip() function
import java.util.*;
import java.util.stream.IntStream;

    public class Program12 {

        // Driver code
        public static void main(String[] args)
        {
            // Creating an IntStream of numbers [5, 6, 7,8,9,10,11]
            IntStream stream = IntStream.range(5, 12);

            // Using skip() to skip first 4 values in range
            // and displaying the rest of elements
            stream.skip(4).forEach(System.out::println);
        }
    }

