sum of the first n natural numbers using recursion in Java:

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=Sc.nextInt();
        System.out.println("Sum is "+sum(n));
    }
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}

output:
Enter n value
10
Sum is 55
