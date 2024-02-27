//using reduce() from stream Api


import java.util.*;
import java.util.stream.Stream;
public class Program6 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(8,3,4,10,1,7);

        int result = nums.stream()
                .filter(n -> n%2 ==1)
                .sorted()
                .map(n -> n*2)
                .reduce(0,(c,e) -> c+e);  //Here 0 is starting value.reduce() will return the T which is Integer value in this case

        System.out.println(result);
    }
}
