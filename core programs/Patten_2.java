public class Patten_2 {
    public static void main(String[] args) {
        int i , j;
        for (i=1;i<=4;i++){
            for (j=4;j>=i;j--){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}

// 4321
// 432
// 43
// 4