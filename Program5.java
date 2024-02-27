import java.util.*;
import java.util.stream.Stream;
public class Program5 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(9,3,7,10,31,17);

        //Applying stream on List object
        Stream<Integer> data = nums.stream();

        //counting the elements in stream
        long count = data.count();
        System.out.println(count);


    }
}
