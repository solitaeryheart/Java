public class Main {
    public static void main(String[] args)
    {
        int[] floors;
        int[][] apartments;
        apartments = new int[3][3];
        apartments[0][0]= 101;
        apartments[0][1]= 102;
        apartments[0][2]= 103;
        apartments[1][0]= 200;
        apartments[1][1]= 201;
        apartments[1][2]= 202;
        apartments[2][0]= 300;
        apartments[2][1]= 301;
        apartments[2][2]= 302;
        for(int i =0; i < apartments.length;i++)
        {
            if(i==0)
            {
                System.out.print("APARTMENTS ON GROUND FLOOR ARE : ");
            }
            if(i==1)
            {
                System.out.print("\nAPARTMENTS ON FIRST FLOOR ARE : ");
            }
            if(i==2)
            {
                System.out.print("\nAPARTMENTS ON SECOND FLOOR ARE : ");
            }
            for(int j = 0; j < apartments[i].length;j++)
            {
                System.out.print(apartments[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}