/*Syntax vs semantics*/
//Syntax is what the grammar allows, semantics is what it means.
int x = "five";
// syntax is okay (type identifier = value), semantics is wrong ("five" is not an int).


 /*2....for each loop*/

/*for loop*/
int arr[] = new int[length];
for(int i=0;i<arr.length;i++) {
  System.out.println(arr[i]);
}

OR

/*for each loop*/
int arr[] = new int[length];
for(String s:arr) {
    System.out.println(s);
}

3...Array.sort() method in java to sort array

import java.util.Arrays;

public class SortExample
{
    public static void main(String[] args)
    {

        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};

        Arrays.sort(arr);

        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}


/*4.....Exception in java*/

//Ignore Exception in java

/*try{
   test.setSomething1(0);
}catch(Exception e){
   //ignore
}*/



//How to handle standard Exception
/*try {
    input = Integer.parseInt(scan.next());
    System.out.println("You've entered number: " + input);
  } catch (NumberFormatException e) {
      System.out.println("You've entered non-integer number");
      System.out.println("This caused " + e);
  }*/


/*4...square root of a number*/
        double value =  12.87;
        double sqrtValue = Math.sqrt(value);



/*5....flow of java code*/

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



/*6...TO scan unknown items*/ 
String input;
 while(sc.hasNext()) {
  input = sc.next();
 }