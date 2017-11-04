import java.util.*;

public class Array2D {
    public static void main(String[] arg) {
        int row = 3;
        int col = 3;
        int count = 0;
        int arr[][] = new int[row][col]; 
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++,count++) {
                arr[i][j] = count;
                System.out.print(arr[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}