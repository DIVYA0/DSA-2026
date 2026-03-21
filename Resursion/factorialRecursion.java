The factorial of a number n (written as n!) is the product of all positive integers from 1 to n.

import java.util.Scanner;
class factorialUsingRecursion {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter N value:");
       int n=sc.nextInt();
       System.out.println("Factorial is "+ fact(n));
    }
    public static int fact(int n){
        if(n<=0){
            return 1;
        }
       return n*fact(n-1);
    }
}

output:
Enter N value:
5
Factorial is 120
