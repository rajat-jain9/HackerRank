import java.util.*;

public class MyClass {
	int x = 7;
	public MyClass() {
		x++;
		System.out.print(" n" +x);
	} 
	public MyClass(int i) {
		x += i;
		System.out.print(" p" +x);
	}
	public int method(int i) {
		x += i;
		System.out.print(" s" +x);
		return x;
	}
	public static void main(String arg[]) {
		new MyClass(new MyClass().method(3));
	}
}