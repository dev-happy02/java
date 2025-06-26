// type:- 01.
// public class funtmethod 
//     {
//     public static void printhello(){
//         System.out.println("hello world :");
//         return;
//     }
//     public static void main(String[] args) {
//         printhello();
//     }
// }



// type:- 02.

// import java.util.Scanner;
//     public class funtmethod 
// {
//     public static int calculatesum( ) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter first number :");
//         int a = sc.nextInt();
//         System.out.print("enter second number :");
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("sum is "+ sum );
//         return sum;
//     }
//     public static void main(String[] args) {
//         calculatesum( );
//     }
// }



// type:- 03.


import java.util.Scanner;
    public class funtmethod 
{
    public static int calculatesum(int a, int b ) {
        int sum = a+b;
        System.out.println("sum is "+ sum );
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        int a = sc.nextInt();
        System.out.print("enter second number :");
        int b = sc.nextInt();
        calculatesum(a, b );
    }
}


