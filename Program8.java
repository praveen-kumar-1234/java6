/*Filter 2nd example from StreamApi

*/


import java.util.ArrayList;

public class Program8 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("praveen");
        al.add("rani");
        al.add("sarma");
        al.add("sravya");
        al.add("shiva");

        al.stream()
                .filter(i -> i.startsWith("s"))
                .forEach(System.out::println);

    }





}
