import java.util.*;
public class SelectionSort_String {
    void sort(String arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int min = i;
            for(int j=i+1;j<n;j++)
            if(arr[j].compareToIgnoreCase(arr[min]) < 0) {
                min = j;
            }
            String temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(String arr[]) {
        int n =arr.length;
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] +" ");
        }
    }

    public static void main(String ar[]) {
        SelectionSort_String obj = new SelectionSort_String();
        String arr[] = {"Aep","C","b","Aap","j"};
        obj.sort(arr);
        System.out.println("Sorted array:");
        obj.printArray(arr);
    }
}

