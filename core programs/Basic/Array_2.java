public class Array_2 {
    public static void main(String[] args) {
        int a[] ={100,200,300,400,500};
        int b[] ={11,22,33,44,55};
        // b=a;
        a=b;
        for(int i=0 ; i<a.length;i++){
            System.out.println(a[i]);
        }
        // System.out.println(a);
        // System.out.println(b);
    }
}
