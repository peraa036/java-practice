public class main {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];
        //ili
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
