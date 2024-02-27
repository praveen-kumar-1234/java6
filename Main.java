//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Basics of stream:
We can create a stream in 2 ways
1.By using of() method:Stream.of(1,2,3,6,4)
Directly we can enter values by using of method
2.By using stream() method
Here if we already have collection object or array object then we use stream() method


StreamApi provided several classes,interfaces and methods as part of java.util package
We have two kinds of streams:
1->java.util streams
    To perform operations on data from arrays,collections we use java.util streams
2->java.io streams
    To perform operations on "file" data we use java.io streams


Intermediate operational methods:The methods which perform operations on stream and return a new Stream are called Intermediate operations
                        on the stream
Ex:filter():used to filter the data
    map():used to transform the data
    flatMap():used for data transformation and data flattering   //map()+flattering also we can say
    skip(n):The skip(n) method in Java 8 Streams is a versatile tool for skipping the first n elements of a stream and returning the remaining elements as a new stream.
            Here n-the number of elements to skip. Must be non-negative. skip() follows lazy evaluation.
            The actual skipping happens only when a terminal operation is called on the returned stream.
    limit(n):The limit(n) method in Java 8 Streams returns a new stream containing at most the first n elements from the original stream.
             limit() follows lazy evaluation. The actual processing happens only when a terminal operation is called on the returned stream.
    distinct()

Terminal Operational methods:The methods which perform operations on stream and return a result(not a new Stream) are called Terminal Operational methods

Ex:count()
   collect()
   findFirst()
   forEach()
   reduce()
   min()
   max()

   map():takes stream of data as input performs transformation and returns a new stream of data as output
          Here mapper function will produce one value for each input, so it is also called one to one mapping
   flatMap():takes stream of stream as input performs data transformation and converts to single stream which is called flattering and
             return that single stream as output.Here mapper function produces multiple values for each input value, so it is also called one to many mapping.
   reduce() : in Java Stream API is a powerful tool for combining elements of a stream into a single result
            2 common ways to use reduce()
    i).   T result = stream.reduce(T identity, BinaryOperator<T> accumulator); //here identity is initial value used for reduction if the stream is empty
    ii).    Optional<T> result = stream.reduce(BinaryOperator<T> accumulator);

    findFirst() :Instead of directly returning the element, findFirst() returns an Optional<T>. This enables safe handling of cases where the stream
                might be empty, preventing null pointer exceptions.
    distinct() :Filters out duplicate elements based on their equality. It uses the equals() and hashCode() methods of the objects in the stream for comparison.
                Preserves the original order of elements by default.
                Returns a new Stream containing only the unique elements.

      Stream<T> distinctStream = originalStream.distinct();


*/


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");


        }
    }
