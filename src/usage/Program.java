package usage;

import Sort.*;

/*Created by DongHyun on 2015-09-09.
 */
public class Program {
    public static void main(String[] args){
        //버블 선택 삽입
        //퀵, 병합
        //기수, 계수

        //Bubble Sort
        String[] bubble_array = new String[]{"abc","bcd","aaa","aAa","AAA","qwe","ryw","www","zzz","Zzz","zzZ"};
        Integer[] bubble_array2 = new Integer[]{75,42,450,22,20,125,1332,39,19,66,3,7};
        Bubble_sort<String> strBubble_sort = new Bubble_sort<>();
        Bubble_sort<Integer> intBubble_sort = new Bubble_sort<>();
        strBubble_sort.bubbleSort(bubble_array);
        printArray(bubble_array);
        intBubble_sort.bubbleSort(bubble_array2);
        printArray(bubble_array2);
        System.out.println();

        //Selection_sort
        String[] selection_array = new String[]{"abc","bcd","aaa","aAa","AAA","qwe","ryw","www","zzz","Zzz","zzZ"};
        Integer[] selection_array2 = new Integer[]{75,42,450,22,20,125,1332,39,19,66,3,7};
        Selection_sort<String> strSelection_sort = new Selection_sort<>();
        Selection_sort<Integer> intSelection_sort = new Selection_sort<>();
        strSelection_sort.selectionSort(selection_array);
        printArray(selection_array);
        intSelection_sort.selectionSort(selection_array2);
        printArray(selection_array2);
        System.out.println();

        //insertion_sort
        String[] insertion_array = new String[]{"abc","bcd","aaa","aAa","AAA","qwe","ryw","www","zzz","Zzz","zzZ"};
        Integer[] insertion_array2 = new Integer[]{75,42,450,22,20,125,1332,39,19,66,3,7};
        Insertion_sort<String> strInsertion_sort = new Insertion_sort<>();
        Insertion_sort<Integer> intInsertion_sort = new Insertion_sort<>();
        strInsertion_sort.doInsertionSort(insertion_array);
        printArray(insertion_array);
        intInsertion_sort.doInsertionSort(insertion_array2);
        printArray(insertion_array2);
        System.out.println();

        //QuickSort
        String[] quick_array = new String[]{"abc","bcd","aaa","aAa","AAA","qwe","ryw","www","zzz","Zzz","zzZ"};
        Integer[] quick_array2 = new Integer[]{75,42,450,22,20,125,1332,39,19,66,3,7};
        QuickSort<String> strQuickSort = new QuickSort<>();
        QuickSort<Integer> intQuickSort = new QuickSort<>();
        strQuickSort.QuickSort(quick_array);

        printArray(quick_array);
        intQuickSort.QuickSort(quick_array2);
        printArray(quick_array2);
        System.out.println();

        //MergeSort
        String[] merge_array = new String[]{"abc","bcd","aaa","aAa","AAA","qwe","ryw","www","zzz","Zzz","zzZ"};
        Integer[] merge_array2 = new Integer[]{75,42,450,22,20,125,1332,39,19,66,3,7};
        MergeSort<String> strMergeSort = new MergeSort<>();
        MergeSort<Integer> intMergeSort = new MergeSort<>();
        strMergeSort.MergeSort(merge_array);
        printArray(merge_array);
        intMergeSort.MergeSort(merge_array2);
        printArray(merge_array2);
        System.out.println();

        //RadixSort
        String[] radix_array = new String[]{"abc","bcd","aaa","aAa","AAA","qwe","ryw","www","zzz","Zzz","zzZ"};
        Integer[] radix_array2 = new Integer[]{75,42,450,22,20,125,1332,39,19,66,3,7};
        RadixSort<String> strRadixSort = new RadixSort<>();
        RadixSort<Integer> intRaidxSort = new RadixSort<>();
        strRadixSort.radixsort(radix_array);
        printArray(radix_array);
        intRaidxSort.radixsort(radix_array2);
        printArray(radix_array2);
        System.out.println();

        //CountingSort
        int[] counting_array = new int[]{75,42,450,22,20,125,1332,39,19,66,3,7};
        CountingSort countingSort = new CountingSort();
        countingSort.CountingSort(counting_array);
        printArray(counting_array);
    }

    public static <E> void printArray(E[] array) {
        for(E i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
