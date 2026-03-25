Reverse String

Problem Statement:
Write a function that reverses a string.
The input string is given as an array of characters s. 
You must do this by modifying the input array in-place with O(1)extra memory.

Examples:
Example 1:
Input:s = [“h”,”e”,”l”,”l”,”o”]
Output:[“o”,”l”,”l”,”e”,”h”]

Example 2:
Input:s = [“H”,”a”,”n”,”n”,”a”,”h”]
Output:[“h”,”a”,”n”,”n”,”a”,”H”]

class ReverseString {
    public static void main(String[] args) {
       char[] arr={'d','i','v','y','a','v'};
       System.out.println(reverseString(arr));
    }
    public static char[] reverseString(char[] arr){
        int n=arr.length-1;
        for(int i=0;i<n/2;i++){
            char temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
        }
        return arr;
    }
}
