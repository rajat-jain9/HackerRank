import java.util.*;
public class test {
  public static void main(String args[]) {
  	Scanner sc =new Scanner(System.in);
  	int x = 10;
  	Integer y = 20;
  	Integer z = new Integer(30);
  	System.out.println("x= " +x +" y= " +y +" z=" +z);

  	String s = "Rajat Jain";
  	String s1 = new String("Parveen Narwal");
  	System.out.println("string: " +s +"    string: " +s1);

  	int arr[] = {1,2,3,4,5};
  	for(int i = 0; i < 5; i++) {
  		System.out.println(arr[i] +"\t");
  	}
  	Integer arr1[] = new Integer[5];
  	System.out.print("Enter 5 integer values ");
  	for(int i = 0;i < 5; i++) {
  		arr1[i] = sc.nextInt();
  	}

  	for(int i = 0;i < 5; i++) {
  		System.out.print(arr1[i] +"\t");
  	}

  	String arr2[] = {"Rajat", "Jain", "Parveen", "Vijay"};
  	String arr3[] = new String[5]; //Print in siilar way.
   }
}