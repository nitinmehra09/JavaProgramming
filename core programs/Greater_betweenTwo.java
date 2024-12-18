import java.util.Scanner;
public class Greater_betweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. 1 : ");
        int n = sc.nextInt();
        System.out.print("Enter a no. 2 : ");
        int m = sc.nextInt();
        if(m>n){
            System.out.println(m+ " Geater then " + n);
        }
        else if(n>m){
            System.out.println(n + "Greater then " + m);
        }
        else{
            System.out.println(m +  " = " + n );
        }
        sc.close();
    }
}

