public class whileLoop_2 {
    public static void main(String[] args) {
        int b,c,a=1;
        while (a<=10){
            b=1;
            while (b<=10) {
                c= a*b;
                System.out.println(c + " ");
                b++;
            }
            a++;
            System.out.println("");
        }
    }
}
