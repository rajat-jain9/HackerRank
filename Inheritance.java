import java.util.*;

class SuperClass {
    SuperClass() {
        System.out.println("SuperClass Constructor");
    }

    SuperClass(int a) {
        System.out.println("Super = " +a);
    }

    void print() {
        System.out.println("SuperClass method");
    }
}

class Inheritance extends SuperClass {
    Inheritance() {
      System.out.println("SubClass Constructor");
    }

    Inheritance(int a) {
        super(a);
        System.out.println("Sub = " +a);
    }
    void print() {
        System.out.println("SubClass Method");
    }
    public static void main(String[] arg) {
        //Inheritance obj = new Inheritance();
        Inheritance obj1 = new Inheritance(4);
        //obj.print();
        
    }
}