
import java.util.stream.Stream;

public class Program16 {

        public static void main(String[] args) {
            // Create a stream of integers
            Stream<Integer> stream = Stream.of(5, 3, 8, 2, 7);

            // Sort the elements in the stream
            Integer firstElement = stream.sorted()
                    .findFirst()
                    .orElse(null); // Return null if the stream is empty

            // Print the first element
            System.out.println("First element in the sorted stream: " + firstElement);
        }
    }





