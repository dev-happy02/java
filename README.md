# Java  : 




- Java is a popular, object-oriented programming language.
- It is platform-independent due to the Java Virtual Machine (JVM).
- Java supports multithreading, security, and automatic memory management.
- It is widely used in web apps, Android apps, and enterprise systems.
- Java follows the WORA principle.




## printing hello world ....
```java 
 class Test {
    public static void main(String[] args) {
        System.out.println("Hello world! ");
    }
 }
```




## taking input from user ....
```java
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);
    }   
}
```



```java
import java.util.Scanner;

class Test{
    // psvm 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;
       System.out.print("enter your rollno : ");
       int rollno = input.nextInt();
       System.out.println("your rollno is " + rollno);
        
    }
}
```




## sum of two numbers...
```java
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;
       System.out.print("enter first num1 ");
       int num1 = input.nextInt();
       System.out.print("enter second num2 ");
       int num2 = input.nextInt();
       int sum = num1 + num2 ;
       System.out.println("sum of num1 and num2 is :" + sum);
    }
}
```


# swaping of two nuber...
```java
class Test{
        public static void main(String[] args) {
                int a = 10;
                int b = 40;
                int temp = a;
                a = b;
                b = temp;
                System.out.println(a + " " + b);
        }
}
```




```java
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        int num = (int)(34.344f);
        System.out.println(num);
    }
}
```




## Java is UNICODE LANG...

- Java uses Unicode to represent characters internally. This means:
- Each char in Java is a 16-bit Unicode character.
- Java source code files can include characters from many different languages and scripts (e.g., English, Hindi, Chinese).
- Unicode support helps Java be platform-independent and internationalization-friendly.


```java

class Test {
    public static void main(String[] args) {
        System.out.println(" नमस्ते " );
    }
}
```





### If, else if and  Else of java

```java
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = input.nextInt();
        System.out.print("enter b: ");
        int b = input.nextInt();
        if (a>b){
            System.out.println("a is greater than b");
        }else if (a<b){
            System.out.println("a is smaller than b");
        }else 
        System.out.println("both are equal ");
    }
}
```





# This code is to get temprature

```java
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter temp in cel : ");
        float tempc = in.nextFloat();
        float tempf = (tempc *9/5) + 32;
        System.out.println(tempf);
    }
}
```


# For loop...
```java
class Test {
        public static void main(String[] args) {
            for (int i=1;  i<=5; i++)    {
                System.out.println(i);
            }
        }

}
```



```java

import java.util.Scanner;

class Test {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                for (int i = 1; i<=n; i++){
                        System.out.println(i);
                }
        }
        
}
```

# while loop
```java
class Test{
        public static void main(String[] args) {
                int n = 1;
                while (n<=5) {
                        System.out.println(n);
                        n++;     
                }
        }
}
```


```java
import java.util.Scanner;

class Test{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int i = 1;
                while ( i<=n ) {
                        System.out.println(i);
                        i++;
                }
        }
}
```

# max number...
```java

import java.util.Scanner;

class Test {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int max = a;
                if (b>max){
                        max = b;
                }if (c>max){
                        max = c;
                }
                System.out.println("max num is : " + max );
        }
}
```



```java

import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Test{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                char ch = in.next().trim().charAt(0);
                if (ch >= 'a' && ch <= 'z'){
                        System.out.println("lower");
                }else{
                        System.out.println("upper");
                }
        }
}
```




```java
import java.util.Scanner;

class Test{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int ans = 0;
                while (n>0) {
                        int rem = n%10;
                        n/=10;
                        ans = ans*10 + rem;
                }
                System.out.println(ans);
        }
}
```




## nested if
```java
import java.util.Scanner;

class Test{
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int ans = 0;
                while (true) {
                        System.out.print("enter operater : ");
                        char op = in.next().trim().charAt(0);
                        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                                System.out.println("enter two num : ");
                                int num1 = in.nextInt();
                                int num2 = in.nextInt();
                                if (op == '+'){
                                        ans = num1 + num2;
                                }
                                if (op == '-'){
                                        ans = num1 - num2;
                                }
                                if (op == '*'){
                                        ans = num1 * num2;
                                }
                                if (op == '/'){
                                        ans = num1 / num2;
                                }
                                if (op == '%'){
                                        ans = num1 % num2;
                                }
                        else if (op == 'x' || op == 'X'){
                                break;
                        }
                        else {
                                System.out.println("invalid op : ");
                        }
                
                System.out.println(ans);
                        }
                }
        }
}
```


## switch statements

```java
import java.util.Scanner;

class Test {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("enter kr nam kuno k :");
                String rel = in.next();
                switch (rel) {
                        case  "happy":
                               System.out.println("happy swaraj "); 
                                break;
                        case "aman":
                                System.out.println("aman kumar singh ");
                                break;
                        case "princess":
                                System.out.println(" sahil kumar sharma ");
                                break;
                        default:
                                System.out.println("bhai log ");
                                break;
                }
        }      
}
```

## another way to write switch statement...

```java
import java.util.Scanner;

class Test {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("enter kr nam kuno k :");
                String rel = in.next();
                switch (rel) {
                        case  "happy"-> System.out.println("happy swaraj ");
                        case "aman"-> System.out.println("aman kumar singh ");
                        case "princess" -> System.out.println("shail kumar singh ");
                        default ->System.out.println("bhsi log ");
                }
        }      
}
```



```java
import java.util.Scanner;

class Test {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("enter kr nam kuno k :");
                String rel = in.next();
                int roll = in.nextInt();
                switch (rel) {
                        case  "happy":
                               System.out.println("b.tech "); 
                                break;
                        case "aman":
                                System.out.println("BCA ");
                                break;
                        case "princess":
                                System.out.println("MBA ");
                                switch (roll) {
                                        case 1 :
                                                System.out.println("12205899");
                                                break;
                                        case 2 : 
                                                System.out.println("12201227");
                                                break;
                                }
                                break;             
                        default:
                                System.out.println("In job  ");
                                break;
                }
        }      
}
```




# funtion and method 
## sum of two numbers
```java
import java.util.Scanner;
    public class funtmethod 
{
    public static int calculatesum(int a, int b ) {  // parameters or formal parameters
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
        calculatesum(a, b );  // arguments or actual parameters
        sc.close();
    }
}
```

## product of two number 
```java

public class productoftwonumbers {
    public static int multiply(int a, int b) {
        int product = a*b;
        System.out.println("product is " + product);
        return product;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        multiply(a,b);
    }
}

```




## swaping of two numbers
```java

public class swap {
    public static void swaping(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swaping(a,b);
    }
}

```




## factorial of n..
```java

public class factorial {
    public static int fact(int n) {
        int f = 1;
        for (int i=1; i<=n; i++) {
            f *=i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("factorial is " + fact(5));
    }
}

```



## printing inverted halfpyramid 


```java

public class invertedhalfpyramid 
{
    public static void inverted_pyramid(int n) 
    {
        for (int i=1; i<=n; i++) 
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
                for(int j=1; j<=i; j++)
                {
                    System.out.print("*");
                }
            System.out.println();
        } 
    }
     public static void main(String[] args) {
        inverted_pyramid(5);
```





## printing inverted half pyramid with number

```java 


public class invertedhalfpyramid 
{
  public static void halfpyramidnum(int n) {
        for (int i=1; i <= n; i++) {
            for (int j=1; j<= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfpyramidnum(5);
    }
}
```






# Array


```java 
class Test{
        public static void main(String[] args) {
                int[] arr = {1,2,3,4,5};
                for (int i=0 ; i<arr.length; i++){
                System.out.println(arr[i]);
                }
        System.out.println("length of array " + arr.length);        
        }
}
```
> largest number in the given array 
```java

public class largestnum {
    public static int largest(int num [] ) {
        int lag  = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(lag < num[i]){
                lag = num[i];
            }
        }
        return lag;
    }
    public static void main(String[] args) {
        int num [] = {23,43,25,2,4,6,54};
        System.out.println("largest number is : " + largest(num));
    }
}

```
> smallest number in the given array 

```java

public class smallestnum {
    public static int smallest(int num []) {
        int small =Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(small > num[i]){
                small = num[i];
            }
        }
        return small ;
    }
    public static void main(String[] args) {
        int num [] = {34,54,-23,-56,76};
        System.out.println("smallest num is : "+smallest(num));
    }
}


```

## printing reverse number  
```java
public class revercearray {
    public static void reverse(int num []) {
        int small = 0;
        int large = num.length-1;
        while(small < large){
            int temp = num [large];
            num[large] = num [small];
            num[small] = temp;

            small++;
            large--;
        } 
    }
    public static void main(String[] args) {
        int num []= {1,2,3,4,5,6,7,8,9};
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println( );
    }
}


```




## 2D array
```java
class Test {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println(  );
        }
    }
}
```



## swaping of two number in array
```java

import java.util.Arrays;
class Test {

    public static void main(String[] args) {
        int[] arr = {23, 3, 4, 34, 45};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
}
    static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp ;
    }
}
```

## find max valu in array...
```java

import java.util.Arrays;
class Test{
    public static void main(String[] args) {
        int [] arr = {1,34,43,3,4,24};
        System.out.println(max(arr));
    }
    static int max (int [] arr){
        int maxval = arr[0];
        for(int i =1; i<arr.length; i++){
            if (arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
```











































