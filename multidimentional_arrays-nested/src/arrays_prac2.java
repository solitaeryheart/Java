public class arrays_prac2 {
    public static void main(String [] args)
    {
        int[][] matrix1 = {{2,4,6},
                           {8,3,7}};
        int[][] matrix2 = {{8,5,2},
                           {5,4,9}};
        int[][] result = {{0,0,0},
                          {0,0,0,}};
        for(int i =0; i < matrix1.length;i++)
        {
            for(int j = 0; j < matrix2[i].length;j++)
            {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
