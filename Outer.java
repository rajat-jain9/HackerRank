import java.util.*;
public class Outer {
	int x;
	int y;
	Outer(int x, int y) {
		x += 2;
		y += 3;
		System.out.println("Inside Outer class constructor");
		System.out.print("x" + this.x + ", ");
		System.out.println("y" + this.y);
	}
	class Inner {
		Inner() {
			x += 3;
			y += 2;
			System.out.println("Inside Inner class constructor");
			System.out.print("x" + x + ", ");
			System.out.println("y" + y);
		}
	}
  public static void main(String args[]) {
  	Inner inner = new Outer(4,5).new Inner(); //First Outer Class constructor will call and then Inner class constructor will call.
  }
}