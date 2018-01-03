import java.util.*;
public class SpecialNumber {
  public static void main(String args[]) {
  		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter a number: ");
  		int num = sc.nextInt();
  		int sum = 0;
  		int i = 1;
  		while(i < num) {
  			if(num % i == 0) {
  				sum = sum + i;
  			}
  			i++;
  		}
  		if(sum == num)
  			System.out.println("Special Number");
  		else
  				System.out.println("Not a Special Number");
  }
}