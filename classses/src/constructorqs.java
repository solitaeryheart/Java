public class constructorqs {
    private int id;
    private String name;
    public constructorqs()
    {
        id = 5;
        name = "dud";
    }
    public constructorqs(int x,String  y)
    {
        id = x;
        name = y;
    }
    public String getName()
    {return name;}

    public void setName(String n) {
        name = n;
    }
    public void setId(int i)
    {
        id = 1;}
    public int getId()
    {
        return id;
    }
}

 class main33{
    public static void main(String []args)
    {
        constructorqs c = new constructorqs(5,"ervgv");

        System.out.println(c.getId());
        System.out.println(c.getName());
    }
}