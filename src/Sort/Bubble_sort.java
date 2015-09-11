package Sort;

public class Bubble_sort<E> {

    public static <E> void bubbleSort(E[] unsorted) {
        for(int iter =1; iter< unsorted.length; iter++){
            for(int inner = 0; inner < (unsorted.length - iter); inner ++){
                if((((Comparable) (unsorted[inner])).compareTo(unsorted[inner+1])) > 0){
                    E tmp = unsorted[inner];
                    unsorted[inner] = unsorted[inner + 1];
                    unsorted[inner + 1] = tmp;
                }
            }
        }
    }
}