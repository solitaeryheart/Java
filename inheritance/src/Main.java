import java.util.SplittableRandom;

class humanBEING{
    void plays(){
        System.out.println("PLAYS");
    }
    void fights()
    {
        System.out.println("FIGHTS");
    }
}

class employee extends humanBEING {
    void salary() {
        int salary = 150000;
        System.out.println("THE SALARY OF EMPLOYEE IS "+salary);
    }
    void address()
    {
        String address = "DARGAH HAZRATBAL SRINAGAR";
        System.out.println("THE ADDRESS OF EMPLOYYE IS "+address);
    }
    void work()
    {
        String work = "ASSISTANT PROFESSOR";
        System.out.println("THE EMPLOYEE WORKS AS AN ASISTANT PRODFESSOR " + work);
    }
}

public class Main {
    public static void main(String[] args)
    {
        employee obj = new employee();
        obj.address();
        obj.work();
        obj.salary();
    }
}