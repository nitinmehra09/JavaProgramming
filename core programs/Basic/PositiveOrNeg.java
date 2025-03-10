import java.util.Scanner;
public class PositiveOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Your enter zero (0)");
        }
        sc.close();
    }
}
