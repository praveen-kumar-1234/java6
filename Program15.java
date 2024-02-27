import java.util.Arrays;

public class Program15 {

        public static void main(String[] args) {
            int[] nums = {9,32,7,10,31,17,14};

            Arrays.stream(nums)                  //1 stream created           /* Here actually streams are replaced
                    .filter(n -> n%2 == 1)      //1 stream created           *  so lot of memory is not wasted*/
                    .sorted()                   //1 stream created
                    .forEach(System.out::println);

        }

    }


