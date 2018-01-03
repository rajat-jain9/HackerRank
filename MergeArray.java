import java.util.*;
class MergeArray {
	public static void main(String arg[]) {
		int a[] = {2,3,5,8,9};
		int b[] = {1,4,6,7,10};
		int len_a = a.length;
		int len_b = b.length;
		int n = len_a + len_b;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] res = new int[n];
		for(i = 0; i< n; i++) {
			while(j<len_a && k<len_b) {
				if(a[j] > b[k]) {
					res[i] = b[k];
					k++;
					System.out.println("indide first");
				}
				if(a[j] < b[k]) {
					res[i] = a[j];
					j++;
					System.out.println("indise 2");
				}
			}
			while(j > len_a) {
				res[i] = b[k];
				k++;
				System.out.println("indise 3");
			}
			while(k > len_b) {
				res[i] = a[j];
				j++;
				System.out.println("indise 4");
			}
			System.out.println(res[i]);
		}
	}
}