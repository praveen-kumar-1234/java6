import java.util.*;
import java.util.stream.Stream;

public class Program1 {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9,3,7,10,31,17);

        Stream<Integer> data = numbers.stream();
        Stream<Integer> sortedData = data.sorted();
        sortedData.forEach(n -> {
            System.out.println(n);
        });
    }
}
