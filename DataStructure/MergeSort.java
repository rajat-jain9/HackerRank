import java.util.*;
public class MergeSort {
  void merge(int arr[],int low,int mid,int high) {
    int i=low;
    int j=mid+1;
    int k=low;
    int left[] = new int[mid];
    int right[] = new int[(arr.length-mid)];
    while(i<mid && j<high) {
      if(left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      }
      else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }
    while(i < mid)
      arr[k] = left[i];
      i++;
       k++;
    while(j < high)
      arr[k] = right[j];
      j++;
      k++;
  }


  void mergesort(int arr[],int low,int high) {
    int mid;
    if(low<high) {
      mid = (low+high)/2;
      mergesort(arr,low,mid);
      mergesort(arr,mid+1,high);
      merge(arr,low,mid,high);
    }
  }

  void printArray(int arr[]) {
      int n =arr.length;
      for(int i=0;i<n;i++) {
          System.out.println(arr[i] +" ");
      }
  }

  public static void main(String ar[]) {
      MergeSort obj = new MergeSort();
      int arr[] = {64,23,10,25,12};
      int low = 1;
      int high = arr.length;
      obj.mergesort(arr,low,high);
      System.out.println("Sorted array:");
      obj.printArray(arr);
  }
}

