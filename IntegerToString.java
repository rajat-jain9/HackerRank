import java.util.*;
class IntegerToString {
  public static void main(String arg[]) {
    int i = 65;
    //String s = (String) i; //Wrong method give error
    String s = Integer.toString(i); //to change integer into string
    System.out.println("integer:" + s);
  }
}