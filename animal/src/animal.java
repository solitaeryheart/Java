
/*public class employee{
    float salary = 20000;
    {
        class teacher extends employee
        {
            float incentive = 1000;
            public void main(String[] args)
            {
                teacher obj = new teacher();
                System.out.println("salary is " + obj.salary);
                System.out.println("incentive is " + obj.incentive);
            }
        }
    }
}

public class employee {
float salary = 15000;
}
class teacher extends employee
{
    float incentive = 1500;
    public static void main(String[] args)
    {
        teacher obj = new teacher();
        System.out.println("salary is " + obj.salary);
        System.out.println("incentive is " + obj.incentive);
    }
}*/

public class animal {
    void eat()
    {
        System.out.println("eating");
    }
    class dog extends animal{
        void bark()
        {
            System.out.println("barking");
        }
    }
    class cat extends animal
    {
        void meow()
        {
            System.out.println("meowing");
        }
    }

}


public class main{
    public static void main(String[] args)
    {
        animal.dog d = new dog();
        animal.cat c = new d'at();

        d.eat();
        d.bark();
        c.meow();
        c.eat();

    }

}











