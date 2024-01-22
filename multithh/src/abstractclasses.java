import java.awt.event.AdjustmentEvent;
import java.util.*;
abstract class Parent{
    Parent()
    {
        System.out.println("PARENT CLASS CONSTRUCTOR");
    }
    public void hello()
    {
        System.out.println("hello");
    }
    abstract public void greet();
}
class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("overrided greet in child class");
    }
}
abstract class Child2 extends Parent{
    Child2()
    {
        System.out.println("child 2 constructor");
    }
}
public class abstractclasses {
    public static void main(String[] args) {
    Child c = new Child();
    c.greet();
    }
}
