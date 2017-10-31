import java.util.*;
public class MergeSort {
  int [] merge(int left[],int right[]) {
    int n = left.length+right.length;
    int resLength = n;
    int res[] = new int[n];
    int indexL = 0;
    int indexR = 0;
    int indexRes = 0;

    while(indexL<left.length && indexR<right.length) {
      if(left[indexL] <= right[indexR]) {
        res[indexRes] = left[indexL];
        indexL++;
      }
      else {
        res[indexRes] = right[indexR];
        indexR++;
      }
      indexRes++;
    }
    while(indexL < left.length) {
      res[indexRes] = left[indexL];
      indexL++;
      indexRes++;
    }
    while(indexR < right.length) {
      res[indexRes] = right[indexR];
      indexR++;
      indexRes++;
    }
    return res;
  }


  int[] mergesort(int arr[]) {
    if(arr.length<=1) {
      return arr;
    }
    int n = arr.length;
    int mid = n/2;
    int left[] = new int[mid];
    int right[] = new int[n-mid];
    int res[] = new int[n];
    for(int i=0;i<mid;i++) {
      left[i] = arr[i];
    }
    int k = 0;
    for(int j=mid;j<n;j++) {
      if(k<right.length) {
        right[k] = arr[j];
        k++;
      }
    }
    left = mergesort(left);
    right = mergesort(right);

    res = merge(left,right);
    return res;
  }

  public static void main(String ar[]) {
      MergeSort obj = new MergeSort();
      int arr[] = {64,23,10,10,12,87,40};
     arr = obj.mergesort(arr);
      System.out.println("Sorted array:");
      for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
      }
  }
}

