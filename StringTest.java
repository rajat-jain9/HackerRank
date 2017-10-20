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
        String char1 = s1.substring(0,1); //s1.substring(start,end)
        System.out.println("First character of " +s1 +" is: "  + char1);

        String char2 = s1.substring(3,7);
        System.out.println(" character between 3 and 7 of " +s1 +" is: " + char2);

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



        //square root of a number
        double value =  12.87;
        double sqrtValue = Math.sqrt(value);
    }
}

