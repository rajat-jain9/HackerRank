import java.util.*;
class Dictionary {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String=");
    String s1 = sc.next();
    System.out.print("Enter String=");
    String s2 = sc.next();
    int len = 0;
    String s ;
    boolean flag = true ;

    if(s1.length() >= s2.length())
        len = s2.length();
    else len = s1.length();

    for(int i = 0;i < len;i++) {
        //char c = s2.charAt(i); //to get each character from a string
        int i1 =  (int) s1.charAt(i);
        int i2 = (int) s2.charAt(i);
        if(i2 > i1) {
            flag = true;
            break;
        }
        if (i1 > i2) {
            flag = false;
            break ;
        }
        if (i1 == i2) {
          System.out.println("inside");
          continue ;
        }
    }

    if(flag == true) {
        System.out.println(s1 +"\n" + s2);
    }
    if (flag == false)
        System.out.println(s2 +"\n" + s1);

  }
}