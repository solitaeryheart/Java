
interface Bicycle{
    int a = 100;
    void speedup(int up);
    void speeddown(int down);
}
interface Direction{
    void goesleft();
    void goesright();
}
class Avon implements Bicycle , Direction{
    int speed = 8;
    public void speedup(int up)
    {
        speed = speed + up;
    }
    public void speeddown(int down)
    {
        speed = speed - down;
    }

    public void goesleft() {
        System.out.println("bicycle turns left");
    }

    public void goesright() {
        System.out.println("bicycle turns right");
    }
}
class interfacesjava {
    public static void main(String[] args) {
      Avon a = new Avon();
      a.speedup(5);
        System.out.println(a.speed);
        a.speeddown(7);
        System.out.println(a.speed);
        System.out.println(a.a);
        a.goesleft();
        a.goesright();
    }
}