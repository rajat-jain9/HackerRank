import java.io.*;
import java.util.*;

public class KeyValue{

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String key[] = new String[n];
    Integer value[] = new Integer[n];
    String input;
    Map<String,Integer> myMap = new HashMap<String,Integer>();
    //List<String> list = new ArrayList<String>();

    for(int i=0;i<n;i++) {
      key[i] = sc.next();
      value[i] = sc.nextInt();
      myMap.put(key[i],value[i]);
    }

    while(sc.hasNext()) {
      input = sc.next();
      System.out.println(input +" = " +myMap.get(input));
    }
    /*input = sc.next();
    System.out.println(input +" = " +myMap.get(input));
*/
    /*for(int i=0;i<n;i++) {
      System.out.print(key[i] +" ");
      System.out.print(value[i]);
      System.out.print("\n");
    }
    for(int i=0;i<n;i++) {
      myMap.put(key[i],value[i]);
       //return value for specified key;
      //System.out.println(myMap.containsKey("Hi")); //return true
    }*/

  }
}