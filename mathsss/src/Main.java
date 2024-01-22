class Maths
{
    void sum()
    {
        int a=84;
        int b=99;
        int sum = a+b;
        System.out.printf("THE SUM OF %d AND %d IS %d",a,b, sum);
    }
    void avg()
    {
        float aa = 77;
        float bb = 88;
        float c = 95;
        float avg = (aa+bb+c)/300;
        System.out.printf("\nTHE AVERAGE OF %.2f , %.2f AND %.2f IS %.2f ",aa,bb,c, avg);
    }
    void divide()
    {
        float ax = 77;
        float bx = 55;
        float div = ax/bx;
        System.out.printf("\n %d DIVIDED BY %f IS EQUAL TO %f ",ax,bx, div);
    }
    void multiply()
    {
        int y = 44;
        int n = 51;
        int x = y*n;
        System.out.printf("\n THE PRODUCT OF %d AND %d IS %d ",y,n, x);
    }
    void subtract()
    {
        int a = 94; int b = 89; int sub = a-b;
        System.out.printf("\n%d SUBTRACTED FROM %d IS EQUAL TO %d ", a , b ,sub);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Maths obj = new Maths();
        obj.sum();
        obj.avg();
        obj.divide();
        obj.multiply();
        obj.subtract();
    }
}