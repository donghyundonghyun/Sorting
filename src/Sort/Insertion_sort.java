package Sort;

public class Insertion_sort<T> {

    public <T extends Comparable<T>> void doInsertionSort(T[] input) {

        if (input == null) {
            throw new RuntimeException("Input array cannot be null");
        }
        int length = input.length;
        if (length == 1) return;
        int i, j;
        T temp;
        for (i = 1; i < length; i++) {
            temp = input[i];

            for (j = i; (j > 0 && (temp.compareTo(input[j - 1]) < 0)); j--) {

                input[j] = input[j - 1];
            }

            input[j] = temp;
        }

    }
}