public class multid_arrays
{
    public static void main(String [] args){

        int[] floors;
        int[][] apartments;
        int[][][] room;
        room = new int[3][3][2];
        room[0][0][0] = 100;
        room[0][0][1] = 101;
        room[0][1][0] = 110;
        room[0][1][1] = 111;
        room[0][2][0] = 120;
        room[0][2][1] = 121;

        room[1][0][0] = 200;
        room[1][0][1] = 201;
        room[1][1][0] = 210;
        room[1][1][1] = 211;
        room[1][2][0] = 220;
        room[1][2][1] = 221;

        room[2][0][0] = 300;
        room[2][0][1] = 301;
        room[2][1][0] = 310;
        room[2][1][1] = 311;
        room[2][2][0] = 320;
        room[2][2][1] = 321;

       for(int i = 0; i < room.length;i++)
        {
            for(int j = 0; j < room[i].length;j++)
            {
                for(int k = 0; k < room[i][j].length;k++)
                {
                    System.out.print(room[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
/*  for(int i = 0; i < 3;i++)
        {
            for(int j = 0; j < 3;j++)
            {
                for(int k = 0; k < 2;k++)
                {
                    System.out.print(room[i][j][k]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }*/