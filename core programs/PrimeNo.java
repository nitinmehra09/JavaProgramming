public class PrimeNo {
    public static void main(String[] args) {
        int n = 22,i;
        boolean f = false;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                f=true;break;
            }
        }
        if(f==true){
            System.out.println("no. is not prime");
        }
        else{
            System.out.println("no. is prime ");
        }
    }
}
