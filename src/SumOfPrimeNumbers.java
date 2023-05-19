import java.util.function.Function;

public class SumOfPrimeNumbers {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        Function<Integer, Integer> f1 = (x) -> {
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                return x;
            }
            return 0;
        };
        int res = sum(arr, f1);
        System.out.println(res);
    }

    public static int sum(int arr[], Function<Integer, Integer> fun) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + fun.apply(arr[i]);
        }
        return sum;
    }
}