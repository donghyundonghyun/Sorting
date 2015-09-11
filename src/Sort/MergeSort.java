package Sort;

public class MergeSort<T> {

    public <T extends Comparable<T>> void MergeSort(T[] a) {
        MergeSort(a, 0, a.length - 1);
    }

    public <T extends Comparable<T>> void MergeSort(T[] a, int left, int right) {
        if (right - left < 1) return;
        int mid = (left + right) / 2; //�߰����� ���

        // �ѷ� ����� ������ ����
        MergeSort(a, left, mid); //ó��~ �߰� ����
        MergeSort(a, mid + 1, right);  //�߰�+1~ �� ����

        //���ĵ� �� �迭 �����ϱ�
        merge(a, left, mid, right);
    }

    public <T extends Comparable<T>> void merge(T[] a, int left, int mid, int right) {

        Object[] tmp = new Object[right - left + 1];
        int L = left;  //���� ��Ʈ ù �ε���
        int R = mid + 1;  //������ ��Ʈ ù �ε���
        int S = 0;   // ���� �Ϸ�� �迭 �ε���
        while (L <= mid && R <= right) { //���� ������ ��Ʈ�� �� ���� �� ���ĵɶ� ����
            if (a[L].compareTo(a[R]) <= 0) //���� ��Ʈ ���� <= ������ ��Ʈ����
                tmp[S] = a[L++]; //������Ʈ ���Ҹ� �� �迭�� ����
            else                   //���� ��Ʈ ���� > ������ ��Ʈ����
                tmp[S] = a[R++]; //������ ��Ʈ ���Ҹ� �� �迭�� ����
            S++;
        }
        if (L <= mid && R > right) { // ���� ��Ʈ�� ���� ������ ���� ���
            while (L <= mid)
                tmp[S++] = a[L++];
        } else {    // ������ ��Ʈ�� ���� ������ ���� ���
            while (R <= right)
                tmp[S++] = a[R++];
        }
        for (S = 0; S < tmp.length; S++) {   //������ �̵�
            a[S + left] = (T) (tmp[S]);
        }
    }
}