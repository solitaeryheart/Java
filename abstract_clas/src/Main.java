/*abstract class shapes
{
  public int side1;
  public int side2;
  public abstract void printArea();
  public shapes (int side1, int side2)
  {
      this.side1=side1;
      this.side2=side2;
  }
}
class Rectangle extends shapes
{
    public Rectangle(int l, int b)
    {
        super(l,b);
    }

    @Override
    public void printArea() {
        System.out.println("AREA OF RECTANGLE IS : "+(side1*
                side2));
    }
}
class Circle extends shapes
{
    public Circle(int r)
    {
        super(r);
    }

    @Override
    public void printArea() {
        System.out.println("AREA OF VIRVLE IS : "+(3.14*side1*side1));
    }
}
class Triangle extends shapes
{
    public Triangle(int b, int h)
}*/

public class Main {
    public static void main(String[] args) {
        //array indexes start from 0 and goes to n-1
        int[] marks = new int[5];
        marks[0] = 95;
        marks[1] = 97;
        marks[2] = 99;
        marks[3] = 77;
        marks[4] = 85;
        System.out.println(marks.length);
   /*     for(int i= 0;i< marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        for(int i=marks.length-1;i>0;i--)
        {
            System.out.println(marks[i]);
        }*/
        // for each loop
        for(int element : marks)
        {
            System.out.println(element);
        }
    }
}