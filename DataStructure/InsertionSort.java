import java.util.*;
public class InsertionSort {
  int[] quickSort(int arr[],int len) {
    for(int i=1;i<=len-1;i++) {
        int value = arr[i];
        int index = i;
        while(index>0 && arr[index-1] > value) {
            arr[index] = arr[index-1];
            index--;
        }
        arr[index] = value;
    }
    return arr;
  }

  public static void main(String ar[]) {
      InsertionSort obj = new InsertionSort();
      int arr[] = {7,2,1,6,8,5,3,4};
      arr = obj.quickSort(arr,arr.length);
      System.out.println("Sorted array:");
      for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
      }
  }
}

