import java.io.*;
import java.util.*;

public class test {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String key[] = new String[n];
    Integer value[] = new Integer[n];
    String input;
    Map<String,Integer> myMap = new HashMap <String,Integer>();

    for(int i=0;i<n;i++) {
      key[i] = sc.next();
      value[i] = sc.nextInt();
      myMap.put(key[i],value[i]);
    }

    while(sc.hasNext()) {
      input = sc.next();
      if(myMap.containsKey(input))
        System.out.println(input +" = " +myMap.get(input));
      else
        System.out.println("Not Found");
    }
  }
} 