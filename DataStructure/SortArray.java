//Merge two sorted array....
import java.util.*;
public class SortArray {
  int[] merge(int a1[],int a2[]) {
    int i=0;
    int j=0;
    int k=0;
    int l1 = a1.length;
    int l2 = a2.length;
    int n = l1+l2;
    int res[] = new int[n];
      while(i<l1 && j<l2) {
        if(a1[i] <= a2[j]) {
          res[k] = a1[i];
          i++;
        }
        else {
          res[k] = a2[j];
          j++;
        }
        k++;
      }
      while(i<l1) {
        res[k] = a1[i];
        i++;
        k++;
      }
      while(j<l2) {
        res[k] = a2[j];
        j++;
        k++;
      }
    return res;
  }

  public static void main(String arr[]) {
    SortArray obj = new SortArray();
    int a1[] = {2,4,6,8};
    int a2[] = {1,3,5,7};
    int n = a1.length+a2.length;
    int res[] = new int[n];
    res = obj.merge(a1,a2);
    System.out.print("sorted array");
    for(int i=0;i<n;i++) {
      System.out.println(res[i]);
    }
  }
}