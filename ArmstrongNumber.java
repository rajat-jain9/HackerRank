import java.util.*;
public class ArmstrongNumber {
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
  		}
  		System.out.println("sum " +sum);
  		System.out.println("num " +num);
  		if(sum == num)
  			System.out.println("Armstrong Number");
  		else
  				System.out.println("Not a ArmstrongNumber");
  }
}