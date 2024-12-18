public class ArmstromgNo {
    public static void main(String[] args) {
        int a = 183 , b , i , f=0 , n ;
        n = a;
        for(i=1;i<=3;i++){
            b= n%10;
            f= f+ b*b*b;
            n=n/10;
        }
        if(a==f){
            System.out.println("No. is amstrong ");
        } 
        else{
            System.out.println("No. is not amstrong ");
        }
    }
}
