import java.util.*;
public class QuickSort {
  int partition(int arr[],int start,int end) {
    int pivot = arr[end];
    int pIndex = start;
    for(int i=start;i<end;i++) {
      if(arr[i] <= pivot) {
        int temp = arr[pIndex];
        arr[pIndex] = arr[i];
        arr[i] = temp;
        pIndex++;
      }
    }
    int temp = arr[pIndex];
    arr[pIndex] = arr[end];
    arr[end] = temp;
    return pIndex;
  }
  int[] quickSort(int arr[],int start,int end) {
    if(start<end) {
      int pIndex = partition(arr,start,end);
      quickSort(arr,start,pIndex-1);
      quickSort(arr,pIndex+1,end);
    }
    return arr;
  }

  public static void main(String ar[]) {
      QuickSort obj = new QuickSort();
      int arr[] = {7,2,1,6,8,5,3,4};
      int start = 0;
      int end = (arr.length - 1);
      arr = obj.quickSort(arr,start,end);
      System.out.println("Sorted array:");
      for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
      }
  }
}

