/*Using filter from stream Api
filter() will return a Stream object
map() will return a stream object
sorted() will return a stream object
stream() will return a stream object
 */



import java.util.*;
import java.util.stream.Stream;
public class Program4 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(9,32,7,10,31,17,14);

            nums.stream()                  //1 stream created           /* Here actually streams are replaced
                .filter(n -> n%2 == 1)      //1 stream created           *  so lot of memory is not wasted*/
                .sorted()                   //1 stream created
                .map(n -> n*2)              //1 stream created
                .forEach(n -> System.out.println(n));

    }

}
