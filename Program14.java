import java.util.Arrays;
public class Program14 {

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            double averageOfSquare = Arrays.stream(arr)
                    .mapToDouble(num -> num * num)
                    .average()
                    .orElse(0); // If the array is empty, return 0 as the default value

            System.out.println("Average of the squares: " + averageOfSquare);
        }
    }




