import java.util.*;
class StringTest {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String=");
        String s1 = sc.next();
        System.out.print("Enter String=");
        String s2 = sc.next();
        int i = 65;

        //return substring of a string
        public class TestSubstring{  
            public static void main(String args[]){  
                String s="SachinTendulkar";  
                System.out.println(s.substring(6));//Tendulkar  
                System.out.println(s.substring(0,6));//Sachin  
            }  
        }  

        //ASCII Value of String
        String s1 = "AB";
        for(int j=0; j < s1.length(); j++) {
            int i1 =  (int) s1.charAt(j);
            System.out.println(i1);
        }


        //return character of a String
        int i1 =  (int) s1.charAt(1); // charAt()
        int i2 = (int) s2.charAt(1);
        System.out.println(i1);
        System.out.println(i2);

        //convert a integer into string
        String s = Integer.toString(i); //toString()
        System.out.println("integer:" + s);


        //Convert a string into int
        //method-1
        String number = "10";
        int result = Integer.parseInt(number); //integer.parseInt()
        System.out.println(result);

        //method-2
        String number = "10";
        Integer result = Integer.valueOf(number);//Integer.valueOf()
        System.out.println(result);

        //If the string does not contain a parsable integer, a NumberFormatException will be thrown.
        String number = "10A";
        int result = Integer.parseInt(number);
        System.out.println(result);

        /*1...Compare Two numeric Strings Value (converting them into string)*/

Code...
 String s1 = "4";
 String s2 = "34";
 if(Integer.parseInt(s1) > Integer.parseInt(s2))






        /*4....Java String compare*/

Solution 1: Java String comparison with the 'equals' method


if (string1.equals(string2))


Solution 2: String comparison with the 'equalsIgnoreCase' method


String string1 = "foo";
String string2 = "FOO";

// java string compare while ignoring case
if (string1.equalsIgnoreCase(string2))
{
  // this line WILL print
  System.out.println("Ignoring case, the two strings are the same.")
}



Solution 3: Java String comparison with the 'compareTo' method


String string1 = "foo bar";
String string2 = "foo bar";

// java string compare example
if (string1.compareTo(string2) == 0)
{
  // this line WILL print
  System.out.println("The two strings are the same.")
}




Note: Java String compare:  why “==” doesn’t work

if (string1 == string2)
{
  // do something ...
}

However, unlike C++, Java does not let us overload operators like the == operator. The designers of the Java language intentionally made this design decision to simplify the language. While it seems counter-intuitive at first, once you realize that there is an equals method on the String class, it’s not a big deal.

    }
}

