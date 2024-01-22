public class Employee{
    float salary = 20000;
    {
        class teacher extends Employee
        {
            float incentive = 1000;
            public static void main(String[] args)
            {
                teacher obj = new teacher();
                System.out.println("salary is " + obj.salary);
                System.out.println("incentive is " + obj.incentive);
            }
        }
    }
}