import java.util.*;
class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int p = 1;
            int res = a;
            for (int j=0;j<n;j++) {
                 res += p*b;
                 p = p*2;
                int y = 7;
                System.out.print(res +" ");
            }
            System.out.println();
        }
        in.close();
    }
}