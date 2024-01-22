package p2;
import p1.*;
public class c1 {
    public static void main(String[] args) {
        MyClass p2c1 = new MyClass(); //in package 2 used  MyClass imported from package p1
        p2c1.meth1(); //called method1 from class MyClass of package 1
        p2c1.meth2(); //called method1 from class MyClass of package 2
    }
}
