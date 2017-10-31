/*Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.*/

import java.util.Scanner;

public class Anagram
{
    public static void main(String[] input)
    {
        String str1, str2;
        int len, len1, len2, i, j, found=0, not_found=0, found1=0, not_found1=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First String : ");
        str1 = scan.nextLine();
        System.out.print("Enter Second String : ");
        str2 = scan.nextLine();

        len1 = str1.length();
        len2 = str2.length();

        if(len1 == len2)
        {
            len = len1;



            for(i=0; i<len; i++)
            {
                found = 0;
                found = 0;
                for(j=0; j<len; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        found = 1;
                        break;
                    }
                }
                if(found == 0)
                {
                    not_found = 1;
                    break;
                }


                for(j=0; j<len; j++)
                {
                    if(str2.charAt(i) == str1.charAt(j))
                    {
                        found1 = 1;
                        break;
                    }
                }
                if(found1 == 0)
                {
                    not_found1 = 1;
                    break;
                }


            }

            if(found == 1 && found1 == 1)
            {
                System.out.print("Strings are Anagram to Each Other..!!");
            }
            else
            {
                System.out.print("Strings are not Anagram");
            }
        }
        else
        {
            System.out.print("Both Strings Must have the same number of Character to be an Anagram");
        }
    }
}