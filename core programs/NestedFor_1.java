public class NestedFor_1 {
    public static void main(String[] args) {
        int i , j;
        for (i=1;i<5;i++){
            for (j=1;j<=i;j++){
                System.err.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
