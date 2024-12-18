public class whileLoop_1 {
    public static void main(String[] args) {
        int a = 151,b,c=0;
        while(a!=0){
            b= a%10;
            c= c+b;
            a=a/10;
        }
        System.out.println(c);
        if(a==c){
            System.out.println("Pelindrome");
        }
        else{
            System.out.println("Non-pelindrome");
        }
    }
}
