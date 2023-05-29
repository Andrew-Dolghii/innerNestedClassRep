package andrew.nestedClasses;

public class Task2 {
    public static void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        print(new DataStructureIterator() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < nums.length;
            }

            @Override
            public int next() {
                int result = nums[pos];
                pos += 2;
                return result;
            }
        });
    }
}