import java.util.*;
public class test {
  public static void main(String args[]) {
  		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter a number: ");
  		int num = sc.nextInt();
  		int sum = 0;
  		int r;
  		int n = num;
  		while(n != 0) {
  			r = n % 10;
  			sum = sum + r*r*r;
  			n = n/10;
  			System.out.print("n= " +n);
  		}
  		System.out.println("sum " +sum);
  		System.out.println("num " +num);
  		if(sum == num)
  			System.out.println("Yes");
  		else
  				System.out.println("No");
  }
}