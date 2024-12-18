public class pattern_3 {
    public static void main(String[] args) {
        int i , j;
        for (i=1;i<=7;i++){
            for (j=7;j>=i;j--){
                System.out.print(" ");
            }
            for (j=7;j>=i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

/*
      *  
    * * *
  * * * * *
* * * * * * *

 */
