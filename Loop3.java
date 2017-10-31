import java.io.*;
import java.util.*;

public class Loop3 {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    for(int i=0;i<n;i++) {
      s[i] = sc.next();
    }
    for(int i=0;i<n;i++) {
      for(int j=0;j<s[i].length();j += 2) {
        char a = s[i].charAt(j);
        System.out.print(a);
      }
      System.out.print(" ");
      for(int j=1;j<s[i].length();j += 2) {
        char a = s[i].charAt(j);
        System.out.print(a);
      }
      System.out.print("\n");
    }
  }
}



