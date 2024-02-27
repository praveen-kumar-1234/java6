/*Map on stream object will return a stream.

 */


import java.util.*;
import java.util.stream.Stream;

public class Program3 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList( 9,3,7,10,31,17);

        Stream<Integer> data = nums.stream();
        Stream<Integer> mappedData = data.map(n -> n*2);
        mappedData.forEach(n -> System.out.println(n));
    }




}
