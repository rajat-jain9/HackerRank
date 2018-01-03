import java.util.*;
class test {
	static int b = 45;
	static void print() {
		b += 2;
		System.out.println("b: " +b);
	}
}

class StaticBlock {
	public static void main(String arg[]) {
		test.print();
		test.print();
	}
}