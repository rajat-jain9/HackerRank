import java.util.*;
public class QuickSort {
  int partition(int arr[],int start,int end) {
    int pivot = arr[end];             //int pivot = arr[start];   //pivot as 1st element
    int pIndex = start;               //int pIndex = end;
    for(int i=start;i<end;i++) {      //for(int i=end;i>start;i--) {
      if(arr[i] <= pivot) {           //  if(arr[i] >= pivot) {
        int temp = arr[pIndex];
        arr[pIndex] = arr[i];
        arr[i] = temp;
        pIndex++;                     // pIndex--;
      }
    }
    int temp = arr[pIndex];
    arr[pIndex] = arr[end];           //arr[pIndex] = arr[start];
    arr[end] = temp;                  //arr[start] = temp;
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
      int arr[] = {2,2,1,6,8,5,3,4};
      int start = 0;
      int end = (arr.length - 1);
      arr = obj.quickSort(arr,start,end);
      System.out.println("Sorted array:");
      for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
      }
  }
}

