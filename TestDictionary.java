import java.util.*;
public class TestDictionary {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
        }

        for (int var:arr) {
            var+=1;
            System.out.println(var);
        }


        for(int i=0;i<5;i++) {
            int va = 10;
            arr[i] +=va;
        }


        for (int i=0;i<5;i++)
        System.out.println(arr[i]);
    }
}