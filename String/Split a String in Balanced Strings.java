Split a String in Balanced Strings
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.

Example 3:
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".

Approach 1
class Solution {
    public int balancedStringSplit(String s) {
        int L=0;
        int R=0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                L++;
            }else{
                R++;
            }
            if(L==R){
            count++;
            L=0;
            R=0;
            }
        }
        return count; 
    }
Time complexity:O(N) N- length of string;
Space complexity:O(1);

Approach-2(instead of Two variable L,R use one variable)
class Solution {
    public int balancedStringSplit(String s) {
        int temp=0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                temp++;
            }else{
                temp--;
            }
            if(temp==0){
            count++;
            }
        }
        return count; 
    }
}
Time complexity:O(N) N- length of string;
Space complexity:O(1);


   
}
