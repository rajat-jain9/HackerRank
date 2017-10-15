//Different Data types in java
//vaiables 1.Local 2. instance 3. static
//use int and String in place of Integer and String Object
import java.util.*;
public class DataType {
  public static void main(String arg[]) {

    int i =  10; //integer
    Integer g = 80;
    Integer h = new Integer(40);
    int[] arr = {1,2,3,4,5,6}; //or int arr[] = {};
    int hexa = 0x64; //0x prefix for hexadecimal number
    int octal = 0144; //0 prefix for octal number

    float f = 10; //float
    double d = 10; //double
    int e = (int)d; //type casting
    double k = i; //type casting

    char a = 'R'; //character
    char ch[] = {'T','E','S','T'}; //or char[] ch = {};

    String name = "Rajat Jain"; //String literal - use more frequently
    String s = new String("Hello"); //String object
    String str[] = {"rajat","jain"};
    String st[] = new String[2];
    st[0] = "good";
    st[1] = "Boy";

    //int t = name;  //error string cannot be  converted to int

    boolean b = true;
    byte x = 68;

    System.out.println("int:" + i);
    System.out.println("Integer:" + g);
    System.out.println("Integer-Object:" + h);
    System.out.println("int-array:" + arr[3]);
    System.out.println("hexadecimal:" + hexa); //64 = 100 (in hexadecimal number system)
    System.out.println("octal:" + octal); //144 = 100(in octal number system)

    System.out.println("float:" + f);
    System.out.println("double:" + d);
    System.out.println("double to int:" + e);
    System.out.println("int to double:" + k);

    System.out.println("Char:" + a);
    System.out.println("char-array:" + ch[1]); //E
    // System.out.println("name:" + ch[4]); //array out of bond

    System.out.println("String:" + name);
    System.out.println("String-object:" + s);
    System.out.println("String array:" + str[1]);
    System.out.println("string array object:" + st[1]);


    System.out.println("boolean:" + b);
    System.out.println("byte:" + x);



    Scanner scan = new Scanner(System.in); //scanner class object to get input from user
    System.out.print("enter number=");
    int a1 = scan.nextInt();

    System.out.print("Enter string=");
    String myString = scan.next();

    System.out.print("Enter char=");
    char gender = scan.next().charAt(0);

    System.out.print("Enter float=");
    float t = scan.nextFloat();

    System.out.print("Enter double=");
    double y = scan.nextDouble();

    System.out.print("number:" +a1 + "\n" +"string:" +myString +"\n");
    System.out.print("character:" +gender + "\n" +"float:" +t +"\n" +"double:" +y +"\n");


    String one = "Test";
    boolean test1 = one instanceof String;
    System.out.println("boolean:" + test1); //Only applicable for object variable

    DataType data = new DataType();
    boolean test2 = data instanceof DataType;
    System.out.println("boolean:" + test2); //instance of class object

   /* scan.next(); // returns the next token of input
    scan.hasNext(); // returns true if there is another token of input (false otherwise)
    scan.nextLine() // returns the next LINE of input
    scan.hasNextLine(); // returns true if there is another line of iput*/
  }
}
