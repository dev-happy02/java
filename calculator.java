import java.util.Scanner;

public class calculator {
    static int input() {
        System.out.print("Enter your Number: ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        return inp;
    }
    static int add(int res) {
        // input:
        int inp = input();

        // operation:
        res = res + inp;

        return res;
    }
    static int sub(int res) {
        // input:
        int inp = input();

        // operation:
        res = res - inp;
        
        return res;
    }
    static int mul(int res) {
        // input:
        int inp = input();

        // operation:
        res = res * inp;
        
        return res;
    }
    static int div(int res) {
        // input:
        int inp = input();

        // operation:
        if(inp != 0) {
            res = res / inp;    
        } else {
            System.out.println("Can't divide by 0");
        }
        
        return res;
    }
    static int pow(int res){

        int x = input();

        int temp = 1;
        for(int i = 1; i <= x; i++) {
            temp *= res;
        }
        
        res = temp;
        return res;
    }
    static int clear(int res) {
        res = 0;

        return res;
    }
    public static void main(String[] args) {
        int res = 0;
        res = input();

        while (true) {
            System.out.println("1: +");
            System.out.println("2: -");
            System.out.println("3: *");
            System.out.println("4: /");
            System.out.println("5: pow");
            System.out.println("6: clear result");
            System.out.println("7: exit");
            System.out.println("\n\t\tans = " + res );


            System.out.print("Enter your Options: ");
            Scanner sc = new Scanner(System.in);
            int opp = sc.nextInt();
            

            switch (opp) {
                case 1:
                    res = add(res);
                    break;
                case 2: 
                    res = sub(res);
                    break;
                case 3:
                    res = mul(res);
                    break;
                case 4:
                    res = div(res);
                    break;
                case 5:
                    res = pow(res); 
                    break;
                case 6:
                    // clear result:
                    res = clear(res);
                    break;
                case 7:
                    return;
                default:    
                    System.out.println("Invalid input");
            }
            
        }
    }
}
