public class NestedFor_2 {
    public static void main(String[] args) {
        int i , j;
        for (i=1;i<=3;i++){
            for (j=1;j<=i;j++){
                System.err.print(i);
            }
            System.out.print("\n");
        }
    }
}
