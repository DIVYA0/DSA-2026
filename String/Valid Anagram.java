Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
  
Approach 1
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch_s=s.toCharArray();
        char[] ch_t=t.toCharArray();
        Arrays.sort(ch_s);
        Arrays.sort(ch_t);
        for(int i=0;i<ch_s.length;i++){
            if(ch_s.length!=ch_t.length||ch_s[i]!=ch_t[i]){
                return false;
            }
        }
        return true;
    }
}
TC:O(NlogN)
SC:O(N)-string is immutable .so use char[] array
  
Approach 2
  class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            //System.out.println(map.get(s.charAt(i)));
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        } 
        for(int i=0;i<t.length();i++){
            //System.out.println(map.get(t.charAt(i)));
            if(!map.containsKey(t.charAt(i))|| map.get(t.charAt(i))<=0){
                return false;
            }else{
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }
        return true;
    }
}
Tc:O(N)
SC:O(1)-hashset with lowercase string;  
