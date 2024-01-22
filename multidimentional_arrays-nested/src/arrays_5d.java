public class arrays_5d {


        public static void main (String[]args){
        int[][][][][] fiveDArray = new int[2][3][4][5][6];

        // populate the array with values
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 5; l++) {
                        for (int m = 0; m < 6; m++) {
                            fiveDArray[i][j][k][l][m] = i + j + k + l + m;
                        }
                    }
                }
            }
        }

        // print out the contents of the array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < 5; l++) {
                        for (int m = 0; m < 6; m++) {
                            System.out.print(fiveDArray[i][j][k][l][m] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    }
