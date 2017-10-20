
/*A for loop is used where you know at compile time how many times this loop will execute.

A while loop is normally used in a scenario where you don't know how many times a loop will actually execute at runtime.

A  do-while loop is used where your loop should execute at least one time.

For example consider a program which writes some text in a file until file size becomes 2KB. You can use while loop in this scenario like this.

while(IsFileSizeLessThan2K())
    {
    AppendMoreData()
    }


In above case we can't use for loop because we don't know how many times we have to write in the file until it becomes full. We can't use do-while because we are not sure if the loop should run at least once. May be at start file size was more than 2K so we won't run loop at all.

Let's consider another scenario where we want to take an integer input from user until user have entered a positive number. In this case we will use a do-while loop like this.

do
    {
    TakeInputFromUser()
    }
    while(input < 0)


In this case we have to run loop at-least once because we want input from user at-least once. This loop will continue running until user enters a positive number.
*/
import java.util.*;
public class Loops {
    public static void main(String ar[]) {

        System.out.println("For loop");
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }

        int min = 0;
        int max = 5;


       /* System.out.println("While loop");
        while(min<max) {
            System.out.println(min);
            min++;
        }
        System.out.println(min);*/

        System.out.println("Do while loop");

        do {
            System.out.println(min);
            min++;
        }while(min>max);



Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter array elements");
        for(int i=0;i<5;i++) {
            System.out.println("Enter number");
            arr[i] = sc.nextInt();
        }

        for (int var:arr) {
            var+=1;
            System.out.println("Array using for each loop:");
            System.out.println(var);
        }

    }
}