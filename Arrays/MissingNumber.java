Missing Number
Problem Statement:
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Examples:
Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2

class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int totalSum=n*(n+1)/2;
       int partialSum=0;
       for(int i=0;i<nums.length;i++){
         partialSum=partialSum+nums[i];
       } 
       return totalSum -partialSum;
    }
}
time complexity:o(n)
space complexity:o(1)-no extra space is used
