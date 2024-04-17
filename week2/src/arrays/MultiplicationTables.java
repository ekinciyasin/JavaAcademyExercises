package arrays;

public class MultiplicationTables {
    public static void main(String[] args) {

        int[][] table = new int[10][10];


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int padding;

                if (j<9) {
                     padding = 2 - String.valueOf(table[i][j]).length();
                }else {
                    {
                        padding = 3 - String.valueOf(table[i][j]).length();
                    }
                }

                for (int k = 0; k < padding; k++) {
                    System.out.print(" ");
                }

                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
