/*Once you consume the stream,The stream cannot be reused.
If you try to reuse the Stream object you will get the exception IllegalStateException
 */
import java.util.*;
import java.util.stream.Stream;
public class Program2 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(9,3,7,10,31,17);

        Stream<Integer> data = nums.stream();
        data.forEach(n -> System.out.println(n));
        data.forEach(n -> System.out.println(n));
    }






}
