import java.util.*;
public class SelectionSort_Int {
    void sort(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int min = i;
            for(int j=i+1;j<n;j++) {
               if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        int n =arr.length;
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] +" ");
        }
    }

    public static void main(String ar[]) {
        SelectionSort_Int obj = new SelectionSort_Int();
        int arr[] = {64,23,10,25,12};
        obj.sort(arr);
        System.out.println("Sorted array:");
        obj.printArray(arr);
    }
}

