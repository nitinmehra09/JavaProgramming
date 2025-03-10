public class characterIsVowel {
    public static void main(String args[]) {
            
        char ch  = '1' ;
        if (ch == 'a' || ch == 'A'){
            System.out.println("YES");
        }
        if (ch == 'e' || ch == 'E'){
            System.out.println("YES");
        }
        if (ch == 'I' || ch == 'i'){
            System.out.println("YES");
        }
        if (ch == 'O' || ch == 'o'){
            System.out.println("YES");
        }
        if (ch == 'u' || ch == 'u'){
            System.out.println("YES");
        }
        if(ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'I' && ch != 'i' && ch != 'O' && ch != 'o' && ch != 'u' && ch != 'u'){
            System.out.println("NO");

       }
    }
}
