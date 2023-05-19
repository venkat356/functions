import java.util.function.Function;
     public class CheckEvenNumber{

        public static void main(String[] args) {

            Function<Integer, Boolean> mul = x -> x % 2 == 0;
            System.out.println(f1(mul));
            System.out.println("hello");

        }
        static boolean f1(Function<Integer, Boolean> fun) {
            boolean b = fun.apply(35);
            return b;

        }


    }

