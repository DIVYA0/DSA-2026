Jewels and Stones using two nested loops
Problem Statement:
You’re given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is different from "A".

Example:
Input: jewels = “aA”, stones = “aAAbbbb”
Output: 3

Input: jewels = “z”, stones = “ZZ”
Output: 0

Approach 1
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     int count=0;
     for(int i=0;i<stones.length();i++){
        if(jewels.contains(String.valueOf(stones.charAt(i))) ){
            count++;
        }
     }   
     return count;
    }
}

Time complexity:O(N*M)
Space complexity:O(1)

Approach 2
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        int count =0;
        for(int j=0;j<stones.length();j++){
            if(set.contains(stones.charAt(j))){
                count++;
            }
        }
        return count;
    }
}

Time complexity O(N)
Space Complexity:O(1) because set contain maximum value is 52
