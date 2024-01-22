public class accessmodif {
}
class circle {
    private int rad;
    private float area;
    private float perimeter;

    public int getrad() {
        return rad;
    }

    public void setRad(int x) {
        rad = x;
    }

    public float getArea() {
        return area;
    }

    public void setArea(int a) {
        area = 3.14f*a*a;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int p) {
        perimeter = 2*3.14f*p;
    }

}
class Main1{
    public static void main(String[] args)
    {
        circle c = new circle();
        int r = 5;
        c.setRad(r);
        System.out.println(c.getrad());
        c.setArea(r);
        System.out.println(c.getArea());
        c.setPerimeter(5);
        System.out.println(c.getPerimeter());
    }
}