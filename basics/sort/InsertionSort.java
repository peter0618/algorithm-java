package basics.sort;

import java.util.Arrays;

/**
 * 삽입정렬
 *
 * 배열을 정렬 상태로 유지시켜 나가면서, 적절한 위치에 삽입시키는 방법
 *
 * 거의 정렬되어 있는 배열을 정렬할 때 유리한 알고리즘
 *
 * 1,10,5,8,7,6,4,3,2,9
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 18, 12, 7, 20, 11, 1, 5, 16, 9, 6, 15, 4, 8, 3, 13, 19, 17, 2, 14};

        for(int i = 1 ; i < arr.length ; i++) {
            int j = i;
            while(j >= 1 && arr[j] < arr[j-1]) {
                swap(arr, j, j-1);
                j--;
            }
//            for(int k = 0 ; k < i+1 ; k++) {
//                System.out.print(arr[k] + " ");
//            }
//            System.out.println(); // 정렬된 배열이 만들어지는 과정을 출력
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
