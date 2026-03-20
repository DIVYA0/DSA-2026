Binary Search
Binary Search is an efficient algorithm used to find the position of a target value within a sorted array. 
Unlike linear search, it repeatedly divides the search interval in half, significantly reducing the number of comparisons. 

Approach:
Set left = 0 right = nums.length - 1.
While left <= right:
Calculate middle = Math.floor((left + right) / 2).
If nums[middle] === target, return middle.
If target < nums[middle], discard the right half: right = middle - 1.
Else discard the left half: left = middle + 1.
If the target is not found return -1.
  
Time & Space Complexity:
Time Complexity: O(1) (Best Case) when the target is found at the middle initially.
Worst Case: O(log n) the array is halved every iteration.
Space Complexity: O(1) Constant SpaceNo additional data structures.

import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
       int[] arr={13,17,21,25,31,35,56,74};
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter target value :");
       int target=sc.nextInt();
       int result=binarySearch(arr,target);
       System.out.println("index of search element present at "+result);
    }
    public static int binarySearch(int[] arr,int target){
        int left =0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
         return -1;
    }
}

Example 1:
Input: [1, 3, 5, 7, 9]
Output: 7
