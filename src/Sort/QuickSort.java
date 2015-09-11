package Sort;

public class QuickSort<T> {

    public  <T extends Comparable<T>> void QuickSort(T[] array) {
        quick_sort(array, 0, array.length - 1);
    }

    public static <T extends Comparable<T>> void quick_sort(T[] arr, int left, int right) {
        if (left < right) {
            int L = left, R = right;
            T pivot = arr[(L + R) / 2];

            do {
                while (arr[L].compareTo(pivot) < 0) L++; //피벗보다 큰 값을 찾는 과정
                while (pivot.compareTo(arr[R]) < 0) R--; //피벗보다 작은 값을 찾는 과정

                if (L <= R) {
                    T tmp = arr[L];
                    arr[L] = arr[R];
                    arr[R] = tmp;
                    L++;
                    R--;
                }

            } while (L <= R);

            quick_sort(arr, left, R);
            quick_sort(arr, L, right);
        }
    }

}
