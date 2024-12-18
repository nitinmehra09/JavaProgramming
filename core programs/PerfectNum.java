public class PerfectNum {
    public static void main(String[] args) {
        int n = 11, sum=0;
        for(int b=1 ; b<=n/2 ; b++){
            if(n%b==0){
                sum = sum+b;
            }

        }
        if(n == sum ){
            System.out.println("no. is perfect ");
        }
        else{
            System.out.println("no. is not perfect ");
        }

    }
    
}
