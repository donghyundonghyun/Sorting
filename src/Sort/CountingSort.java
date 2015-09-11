package Sort;

/**
 * Created by DongHyun on 2015-09-09.
 */
public class CountingSort {

    public void CountingSort(int[] array){
        int min, max;
        min = array[0];
        max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min) min = array[i];
            if(array[i]>max) max = array[i];
        }
        //System.out.println(min+"/"+max);
        countingSort(array,min,max);

    }

    public void countingSort(int[] array, int min, int max){
        int[] count= new int[max - min + 1];
        for(int number : array){
            count[number - min]++;  // 각 원소의 갯수를 세어줌
        }


        int z= 0;
        for(int i= min;i <= max;i++){
            while(count[i - min] > 0){  //작은 수 부터 재배열
                array[z]= i;
                z++;
                count[i - min]--;
            }
        }

    }


}
