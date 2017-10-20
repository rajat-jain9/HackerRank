/*Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically larger than  or No if it is not.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Note : if A is lexicographically larger than  B (i.e.: does B  come before A in the dictionary?).
*/

import java.util.*;
public class String1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String:");
        String s1 = sc.nextLine();
        System.out.print("Enter second String:");
        String s2 = sc.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();
        int len;
        boolean flag = false;
        System.out.println(len1+len2);

        if(len1>len2) len = len2;
        else len = len1;

        for (int i=0;i<len;i++) {
            int i1 = (int) s1.charAt(i);
            int i2 = (int) s2.charAt(i);

            if(i1 > i2) {
                flag = true;
                break;
            }
            if(i1<i2) {
                flag = false;
                break;
            }
            if (i1 == i2) {
                continue;
            }
         }
         if(flag == true) {
            System.out.println("Yes");
         }
         else System.out.println("No");

        String cap1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        System.out.print(cap1 + " ");
        String cap2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        System.out.println(cap2);
    }
}