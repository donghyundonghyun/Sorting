package Sort;

import base.Node;
import impl.Queue;

/**
 * Created by DongHyun on 2015-09-09.
 */
public class RadixSort<T> {


    public void radixsort(T[] arr){
        int max_digit = 0;
        //최대 자릿수를 구해줌
        for(int i=0; i< arr.length; i++) {
            if(arr[i].toString().length() > max_digit)
                max_digit =arr[i].toString().length();
        }


        Queue<T>[] queues = new Queue[52];
        for(int i=0; i<queues.length;i++){
            queues[i] = new Queue<T>();
        }

        for(int i=0;i<max_digit;i++) {

            for (int j = 0; j < arr.length; j++) {
                Node<T> node = new Node(arr[j]);
                int digit = arr[j].toString().length() - (i+1);
                if(digit<0){
                    queues[0].enqueue(node);
                }else {
                    String idx = arr[j].toString().substring(digit, digit + 1);
                    char[] chars = idx.toCharArray();
                    if(chars[0]>=48 && chars[0]<=57) { // 숫자일 경우
                        queues[Integer.parseInt(idx)].enqueue(node);
                    }else{  //문자일 경우
                        queues[alphaToInt(chars[0])].enqueue(node);
                    }
                }
            }

            int newArrayIndex=0;
            for (int j = 0; j < queues.length; j++) {
                while (!queues[j].isEmpty()) {
                    arr[newArrayIndex++] = queues[j].dequeue().t;
                }
            }
        }


    }
    private int alphaToInt(char alphabet){
        if(alphabet>=65 && alphabet<=90) return (alphabet-65); // 대문자
        else return (alphabet-97+26); //소문자
    }

}
