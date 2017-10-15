import java.util.*;
import java.math.*;

public class RoundingOff {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double res = mealCost + (mealCost * tipPercent)/100 + (mealCost * taxPercent)/100;
        // Write your calculation code here.

        //System.out.println("The total meal cost is" +" " +res +"dollars.");
        // cast the result of the rounding operation to an int and save it as totalCost
       int totalCost = (int) Math.round(res); //Math.round(float or double or long double) function to round off result

        // Print your result
        System.out.println("The total meal cost is" +" " +totalCost +" dollars.");
    }
}