package basics.sort;

import java.util.Arrays;

/**
 * 퀵 정렬
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] data = new int[] {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    public static void quickSort(int[] data, int start, int end) {
        if(start >= end) { // 탈출 조건 빼먹지 않기...!
            return;
        }
        int pivot = start;
        int i = start + 1;
        int j = end;

        while(i <= j) { // 엇갈릴 때까지 반복
            while(i <= end && data[i] <= data[pivot]) { // 기준보다 큰 값 찾을 때 까지 i 커서 이동
                i++;
            }
            while(j > start && data[j] >= data[pivot]) { // 기준보다 작은 값 찾을 때 까지 j 커서 이동
                j--;
            }
            if( j < i ) { // 엇갈림. => 작은 커서의 값과 기준값 교환 (자기 자신일 수도 있음)
                int temp = data[j];
                data[j] = data[pivot];
                data[pivot] = temp;
            } else { // 엇갈리지 않은 경우, 서로 교환
                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }
        quickSort(data, start, j-1);
        quickSort(data, j+1, end );
    }
}
