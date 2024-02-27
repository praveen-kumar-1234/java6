//using method reference from java 8 features


import java.util.function.BiFunction;

 class Arithmetic {
    public static int add(int a, int b){
        return a+b;
    }
}
 class  Program11{
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;// 1,2 parameters are inputs 3-(result/output)
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}