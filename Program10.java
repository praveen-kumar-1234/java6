import java.util.stream.IntStream;;
public class Program10 {

    public static void main(String[] args)
    {
        IntStream intStreamParallel = IntStream.range(1, 10).parallel();

      //  intStreamParallel.forEach(s -> System.out.println(s));

        IntStream intStreamSequential = intStreamParallel.sequential();
        intStreamSequential.forEach(System.out::println);
    }
}
