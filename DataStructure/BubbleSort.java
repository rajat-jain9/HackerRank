import java.util.*;
public class BubbleSort {
    void sort(int arr[]) {
        int n = arr.length;
        for(int i =0;i<n-1;i++) {
            for(int j =0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void printArray(int arr[]) {
        int n =arr.length;
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] +" ");
        }
    }

    public static void main(String ar[]) {
        BubbleSort obj = new BubbleSort();
        int arr[] = {64,23,10,2,12};
        obj.sort(arr);
        System.out.println("Sorted array:");
        obj.printArray(arr);
    }
}

