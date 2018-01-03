import java.util.*;
public class ScanArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int num = Integer.parseInt(sc.nextLine());//String to Int conversion
    int[] arr = new int[num];
    //String[] arr = new String[num];  //add this line for String array
    for(int i = 0; i < arr.length; i++) {
      System.out.print("Enter element " +i +" ");
      arr[i] = sc.nextInt();
    //  arr[i] = sc.nextLine(); //add this line for string array
    }
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}