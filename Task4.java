package andrew.nestedClasses;

import java.util.function.IntPredicate;

public class Task4 {
    private final int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void print(IntPredicate predicate) {
        for (int i = 0; i < nums.length; i++) {
            if (predicate.test(i)) {
                System.out.println(nums[i]);
            }
        }
    }

    public boolean isEvenIndex(int index) {
        return index % 2 == 0;
    }

    public boolean isOddIndex(int index) {
        return index % 2 != 0;
    }

    public static void main(String[] args) {
        Task4 ds = new Task4();

        ds.print(ds::isEvenIndex);

        System.out.println();

        ds.print(ds::isOddIndex);
    }
}