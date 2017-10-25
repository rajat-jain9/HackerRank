import java.util.*;
public class BinarySearch {
  boolean search(int arr[],int len,int element) {
    int start = 0;
    int end = len-1;
    while(start <= end) {
      int mid = (start+end)/2;
      if(arr[mid] == element)
        return true;
      if(arr[mid] > element)
        end = mid-1;
      if(arr[mid] < element)
        start = mid+1;
    }
    return false;
  }
  public static void main(String[] ar) {
    int arr[] ={1,2,3,4,5,6,7,8,9};
    int element = 3;
    boolean status = false;
    BinarySearch obj = new BinarySearch();
    status = obj.search(arr,arr.length,element);
    if(status == true)
    System.out.print("Found");
    else System.out.print("Not Found");
  }
}