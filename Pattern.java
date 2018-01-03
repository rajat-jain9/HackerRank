import java.util.*;
public class Pattern {
  public static void main(String args[]) {
    System.out.println("Pattern 1:-");
    for(int r = 0;r < 5; r++) {
      for(int c = 0; c < 5; c++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }

    System.out.println("Pattern 2:-");
    for(int r = 1;r <= 5; r++) {
      for(int c = 0; c < r; c++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }

    System.out.println("Pattern 3:-");
    for(int r = 5;r >= 1; r--) {
      for(int c = 0; c < r; c++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }

    System.out.println("Pattern 4:-");
    for(int r = 1;r <= 5; r++) {
      for(int c = 5; c > r; c--) {
        System.out.print("  ");
      }
      for(int k = 1;k <= r; k++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }

  System.out.println("Pattern 5:-");
    for(int r = 5;r >= 1; r--) {
      for(int c = 5; c > r; c--) {
        System.out.print("  ");
      }
      for(int k = 1;k <= r; k++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }

     System.out.println("Pattern 4:-");
    for(int r = 1;r <= 5; r++) {
      for(int c = 5; c > r; c--) {
        System.out.print("  ");
      }
      for(int k = 1;k <= r; k++) {
        System.out.print("* ");
      }
      for(int c = 1; c < r; c++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }


    for(int r = 1;r <= 5; r++) {
      for(int c = 5; c > r; c--) {
        System.out.print("  ");
      }
      for(int k = 1;k <= r; k++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    for(int r = 5;r >= 1; r--) {
      for(int c = 5; c > r; c--) {
        System.out.print("  ");
      }
      for(int k = 1;k <= r; k++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
}