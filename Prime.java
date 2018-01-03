import java.util.*;
public class Prime {
  public static void main(String args[]) {
  		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter a number: ");
  		int num = sc.nextInt();
  		int flag = 0;
  		int i = 2;
  		while(i < num) {
  			if(num % i == 0) {
  				flag = 1;
  			}
  			i++;
  		}
  		if(flag == 1 || num == 1 || num == 0)
  			System.out.println("Not Prime");
  		else
  				System.out.println("Prime");
  }
}