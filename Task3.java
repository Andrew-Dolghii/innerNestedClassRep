package andrew.nestedClasses;

import java.util.function.Function;

public class Task3 {
    public static void print(Function<Integer, Boolean> iterator) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < nums.length; i++) {
            if (iterator.apply(i)) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        //even index
        print(x -> x % 2 == 0);

        System.out.println();

        //odd index
        print(x -> x % 2 != 0);
    }
}