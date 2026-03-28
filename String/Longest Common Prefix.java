Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

class Solution {
    public String longestCommonPrefix(String[] strs) {
     int n=strs[0].length()-1;
     int x=0;
     while(x<=n){
        System.out.println(strs.length);
        char ch=strs[0].charAt(x);
        for(int i=1;i<strs.length;i++){
            if(x==strs[i].length()||ch!=strs[i].charAt(x) ){
                //System.out.println(strs[0].charAt(x)+"  "+strs[i].charAt(x));
                return strs[0].substring(0,x);
            }
        }
        x++;
     }   
     return strs[0];
    }
}

TC:O(S) s->sum of length of  all string (traverse all values at once)
SC:O(1)
