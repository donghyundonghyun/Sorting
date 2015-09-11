package Sort;

public class MergeSort<T> {

    public <T extends Comparable<T>> void MergeSort(T[] a) {
        MergeSort(a, 0, a.length - 1);
    }

    public <T extends Comparable<T>> void MergeSort(T[] a, int left, int right) {
        if (right - left < 1) return;
        int mid = (left + right) / 2; //중간지점 계산

        // 둘로 나누어서 각각을 정렬
        MergeSort(a, left, mid); //처음~ 중간 까지
        MergeSort(a, mid + 1, right);  //중간+1~ 끝 까지

        //정렬된 두 배열 병합하기
        merge(a, left, mid, right);
    }

    public <T extends Comparable<T>> void merge(T[] a, int left, int mid, int right) {

        Object[] tmp = new Object[right - left + 1];
        int L = left;  //왼쪽 파트 첫 인덱스
        int R = mid + 1;  //오른쪽 파트 첫 인덱스
        int S = 0;   // 정렬 완료된 배열 인덱스
        while (L <= mid && R <= right) { //왼쪽 오른쪽 파트중 한 쪽이 다 정렬될때 까지
            if (a[L].compareTo(a[R]) <= 0) //왼쪽 파트 원소 <= 오른쪽 파트원소
                tmp[S] = a[L++]; //왼쪽파트 원소를 새 배열에 삽입
            else                   //왼쪽 파트 원소 > 오른쪽 파트원소
                tmp[S] = a[R++]; //오른쪽 파트 원소를 새 배열에 삽입
            S++;
        }
        if (L <= mid && R > right) { // 왼쪽 파트가 먼저 정렬이 끝난 경우
            while (L <= mid)
                tmp[S++] = a[L++];
        } else {    // 오른쪽 파트가 먼저 정렬이 끝난 경우
            while (R <= right)
                tmp[S++] = a[R++];
        }
        for (S = 0; S < tmp.length; S++) {   //데이터 이동
            a[S + left] = (T) (tmp[S]);
        }
    }
}