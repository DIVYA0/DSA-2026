Find words containing character
Problem Statement:
You are given a 0-indexed array of strings words and a character x. Return an array of indices representing the words that contain the character x.
The returned array can be in any order.

Example:
Input: words = [“leet”, “code”], x = “e”
Output: [0, 1]

Input: words = [“abc”, “bcd”, “aaaa”, “cbc”], x = “a”
Output: [0, 2]

Input: words = [“abc”, “bcd”, “aaaa”, “cbc”], x = “z”
Output: []

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
Time complexity :O(m*n);
Space complexity:O(1);
