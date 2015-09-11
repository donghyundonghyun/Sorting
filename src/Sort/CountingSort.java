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
            count[number - min]++;  // �� ������ ������ ������
        }


        int z= 0;
        for(int i= min;i <= max;i++){
            while(count[i - min] > 0){  //���� �� ���� ��迭
                array[z]= i;
                z++;
                count[i - min]--;
            }
        }

    }


}
