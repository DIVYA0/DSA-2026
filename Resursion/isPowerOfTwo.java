Write a recursive function isPowerOfTwo(n) that returns true if n is a power of 2, otherwise false.

import java.util.Scanner;
class isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value N: ");
        int n =sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n){
        if(n==1){
            return true;
        }
        else if(n<=0|| n%2==1){
            return false;
        }
       return isPowerOfTwo(n/2);
    }
}

output:
Enter Value N: 
16
true
