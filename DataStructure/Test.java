import java.util.*;
public class Test {
  void partition(int a[],int start,int end) {
    int index[] = new int[end];
    int value = 0;
    int n = 0;
    for(int i=0;i<end;i++) {
      for(int j=i+1;j<end;j++) {
        if(a[i]-a[j] < value)
          index[i] = a[i];
          index[i+1] = a[j];
          n++;
      }
    }
    for(int k=0;k<n;k++)
    System.out.print(index[k]);
  }
  public static void main(String ar[]) {
      Test obj = new Test();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<arr.length;i++) {
          arr[i] = sc.nextInt();
      }
      int start = 0;
      int end = arr.length;
      obj.partition(arr,start,end);
  }
}