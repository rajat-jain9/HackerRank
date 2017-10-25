import java.util.*;
public class test {
    int b = 3;
    void add(int a) {
        a = a+3;//6
        b = b+9; //12
        System.out.println("add=" +a); //6
    }
    void printNum(int a) {
        System.out.println("print=" +a); //3
        System.out.println("b=" +b); //3+9=12
    }
    public static void main(String arr[]) {
        test obj = new test();
        int a = 3;
        obj.add(a);
        System.out.println("main=" +a); //3
        obj.printNum(a);
    }
}