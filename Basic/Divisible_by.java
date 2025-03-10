import java.util.Scanner;
public class Divisible_by {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if (n%3 == 0 && n%4 == 0 && n%8 ==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();

    }
    
}
