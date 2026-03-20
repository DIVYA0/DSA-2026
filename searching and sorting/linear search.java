Linear Search
Linear Search is a simple search algorithm used to find a specific element in an array. It checks each element of the array one by one until the target value is found or the end of the array is reached.

Approach:
Start from the first element of the array.
Compare the current element with the target value.
If a match is found, return the index.
If the loop ends without finding the target, return -1.

Time & Space Complexity:
Time Complexity: O(n) where n is the size of the array.
In the worst case, the algorithm traverses the entire array.
Each element is checked exactly once.
Space Complexity: O(1) Constant Space

import java.util.Scanner;
class LinearSearch {
    public static void main(String[] args) {
       int[] arr={1 ,5 ,4 ,19 ,13};
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter target value ");
       int target=sc.nextInt();
       int result=linearSearch(arr,target);
       System.out.println("index of target element in the array is found at " +result);
    }
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
Example 1:
Input: arr = [2, 4, 7, 10], target = 10
Output: 3
Explanation: 10 is found at index 3
  
Example 2:
Input: arr = [6, 8, 0, 3], target = 5
Output: -1
Explanation: 5 is not present in the array
