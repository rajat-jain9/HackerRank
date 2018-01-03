import java.util.*;
public class FibonacciSeries {
  public static void main(String args[]) {
  		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter a number: ");
  		int num = sc.nextInt();
  		int a = 0, b = 1, r;
  		while(a <= num) {
  			r = b;
  			b = a+b;
  			System.out.print(a +"\n");
  			a = r;
  		}
  }
}