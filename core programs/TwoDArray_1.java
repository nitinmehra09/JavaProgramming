public class TwoDArray_1 {
    public static void main(String[] args) {
        int a[][]={{2,3},{7,8},{30,51}};
        for (int i=0;i<a.length;i++){
            for(int j=0 ;j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------");
    }
}