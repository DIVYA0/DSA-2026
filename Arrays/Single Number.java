Problem Statement:
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Examples:
Example 1:
Input: nums = [2, 2, 1]
Output: 1

Example 2:
Input: nums = [4, 1, 2, 1, 2]
Output: 4

Using Hashtable
import java.util.Hashtable;
class Solution {
    public int singleNumber(int[] nums) {
        Hashtable<Integer,Integer> table=new Hashtable<>();
        for(int i=0;i<nums.length;i++){
           if(!table.containsKey(nums[i])){//--not present
            table.put(nums[i],1);
           }else{//--present
           table.put(nums[i],table.get(nums[i])+1);
           }
        }
        for(int num:nums){
            if(table.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}

No extra space
class Solution {
    public int singleNumber(int[] nums) {
     int xor=0; 
     for(int i=0;i<nums.length;i++){
        xor=xor^nums[i];
     }   
     return xor;
    }
}
