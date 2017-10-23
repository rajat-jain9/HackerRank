import java.util.*;
public class test {
    public static void main(String arr[]) {
        String s1 = "baap";
        String s2 = "Baep";
        if(s1.compareToIgnoreCase(s2) > 0) {
            System.out.print("1");
        }else System.out.print("2");
    }
}