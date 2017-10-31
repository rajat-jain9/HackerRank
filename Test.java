import java.util.*;
import java.io.*;

public class Test {
	public static void main(String arg[]) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number=");
      int n = scan.nextInt();
      System.out.println("\nEnter power=");
      int p = scan.nextInt();
      int res = 1;

      for(int i=0;i<p;i++) {
      	res = n*res;
      	if (i==0) {
 		  continue;
      	}
      	System.out.println(n +"^"+i +"=" +res);
      }
      System.out.println("result=" +res);
	  scan.close();
	}
}