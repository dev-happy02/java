/*
printing half pyramid pattern
output 

1
12
123
1234
12345

 */


import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println( );
        }
        sc.close();
    }
}
