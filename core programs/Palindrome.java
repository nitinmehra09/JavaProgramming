class Palindrome {
    public static void main(String[] args) {
        int a,b,c,n,m;
        n=1;
        while(n<=1000)
        {
            c=0;
            m=n;
            while(m!=0)
            {
                b=m%10;
                c=c*10+b;
                m=m/10;
            }
            if(n==c){
                System.out.println(n);
                n++;
            }
        }
    }
    
}
