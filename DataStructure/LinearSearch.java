import java.util.*;
public class LinearSearch {
  boolean search(int arr[],int len,int element) {
    for(int i=0;i<arr.length;i++) {
      if(element == arr[i])
        return true;
    }
    return false;
  }
  public static void main(String[] ar) {
    int arr[] ={1,2,3,4,5,6,7,8,9};
    int element = 50;
    boolean status = false;
    LinearSearch obj = new LinearSearch();
    status = obj.search(arr,arr.length,element);
    if(status == true)
    System.out.print("Found");
    else System.out.print("Not Found");
  }
}