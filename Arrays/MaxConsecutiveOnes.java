Max Consecutive Ones

Problem Statement:
Given a binary array nums, return the maximum number of consecutive 1’s in the array.
Examples
Example 1:
Input:nums = [1,1,0,1,1,1]
Output:3
Explanation The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input:nums = [1,0,1,1,0,1]
Output:2

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int currCount=0;
     int maxCount=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            currCount++;
        }else{
            maxCount=Math.max(currCount,maxCount);
            currCount=0;
        }
     }  
     maxCount=Math.max(currCount,maxCount);
     return maxCount; 
    }
}
Time complexity :o(n)
space complexity: o(1)-no extra space
