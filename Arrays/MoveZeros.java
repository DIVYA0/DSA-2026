Move Zeroes
Problem Statement:
Given an integer array nums, move all 0’s to the end of it while maintaining the relative order of the non-zero elements.
Note:You must do this in-place without making a copy of the array.

Examples
Example 1:
Input:nums = [0,1,0,3,12]
Output:[1,3,12,0,0]

Example 2:
Input:nums = [0]
Output:[0]

class Solution {
    public void moveZeroes(int[] arr) {
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[x]=arr[i];
                x++;
            }           
        }
        for(int i=x;i<arr.length;i++){
            arr[i]=0;

        }
    }
}

time complexity:0(n)
space complexity:o(1)
