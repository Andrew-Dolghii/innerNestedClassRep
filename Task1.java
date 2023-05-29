package andrew.nestedClasses;

public class Task1 {
    public static void print(DataStructureIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        int[] arrayNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        EvenIterator evenIterator = new EvenIterator(arrayNums);
        print(evenIterator);
    }
}

class EvenIterator implements DataStructureIterator {
    private final int[] numbers;
    private int pos;

    EvenIterator(int[] numbers) {
        this.numbers = numbers;
        pos = 0;
    }

    @Override
    public boolean hasNext() {
        while (pos < numbers.length) {
            if (numbers[pos] % 2 == 0) {
                return true;
            }
            pos++;
        }
        return false;
    }

    @Override
    public int next() {
        int result = numbers[pos];
        pos += 2;
        return result;
    }
}
