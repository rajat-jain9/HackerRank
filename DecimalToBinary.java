import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int j = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n>0) {
            int remainder = n%2;
            n = n/2;
            list.add(remainder);
        }
        Collections.reverse(list);
       // System.out.print(list);
       /* Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next());
        }*/

        /*Print a single base- integer denoting 
        the maximum number of consecutive 's in the binary representation of number
        eg 5-> 101  ans 1 ,13 -> 1101 ans 2 because of two consecutive1's */
        for(int i=0;i<list.size();i++) {
           //System.out.print(list.get(i));
            if(list.get(i) == 1) { 
                count++;
                if(count > j) {
                    j = count;
                }
            }    
            if(list.get(i) == 0) {
                if(count > j) {
                    j = count;
                }    
                count = 0;
            }    
        }
        System.out.println(+j);
    }
}