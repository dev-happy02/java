import java.util.Scanner;

public class chrpttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the char :");
        char ch  = sc.nextLine().charAt(0);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                if( ch > 'z' || ch > 'Z' ) break;
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println( );
        }
        sc.close();
    }
}
