public class NewClass_1 {
    public static void main(String[] args) {
        int a[][] = {{2, 4}, {3, 1}};
        int b[][] = {{1, 3}, {4, 2}};
        int c[][] = new int[2][2];

        // Matrix multiplication
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int t = 0;
                for (int k = 0; k < a[i].length; k++) {
                    t = t + a[i][k] * b[k][j];
                }
                c[i][j] = t;
            }
        }

        // Printing the result of matrix multiplication
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
}
