/*creating stream object by using of() method



 */

import java.util.*;
import java.util.stream.Stream;
public class Program7 {

    public static void main(String[] args) {

        Stream<Integer> s = Stream.of(9,3,7,10,31,17);
        s.filter(i -> i>15)
                .forEach(System.out::println);




    }


}
