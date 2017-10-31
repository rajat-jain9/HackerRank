//Sort a Sting having Numeric values using merge sort(HackerRank Question)
import java.util.*;
public class NumericStringArray {
  int partition(String arr[],int start,int end) {
    String pivot = arr[end];
    int pIndex = start;
    for(int i=start;i<end;i++) {
      if(arr[i].length() == pivot.length() && arr[i].compareToIgnoreCase(pivot) <= 0 || arr[i].length() < pivot.length()) {
        String temp = arr[pIndex];
        arr[pIndex] = arr[i];
        arr[i] = temp;
        pIndex++;
      }
    }
    String temp = arr[pIndex];
    arr[pIndex] = arr[end];
    arr[end] = temp;
    return pIndex;
  }
  String[] quickSort(String arr[],int start,int end) {
    if(start<end) {
      int pIndex = partition(arr,start,end);
      quickSort(arr,start,pIndex-1);
      quickSort(arr,pIndex+1,end);
    }
    return arr;
  }

  public static void main(String ar[]) {
      NumericStringArray obj = new NumericStringArray();
      String arr[] = {"31415926535897932384626433832795","1","3","10","3","5"};
      int start = 0;
      int end = (arr.length - 1);
      arr = obj.quickSort(arr,start,end);
      System.out.println("Sorted array:");
      for(int i=0;i<arr.length;i++) {
        System.out.println(arr[i]);
      }
  }
}