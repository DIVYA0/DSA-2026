Find Most Frequent Vowel and Consonant
This problem requires finding the most frequently occurring vowel and consonant characters in a string, and returning the sum of their frequencies.

Steps
Initialize a character frequency map using a loop.
Define a list of vowels: ['a', 'e', 'i', 'o', 'u'].
Traverse the string and count how often each character appears.
Track the highest frequency vowel and the highest frequency consonant.
Return the sum of those two highest values.

Dry Run
Input: s = "successes"
Frequency map: { s: 4, u: 1, c: 2, e: 2 }
Vowels: u(1), e(2) → maxVowels = 2
Consonants: s(4), c(2) → maxConsonant = 4
Output: 2 + 4 = 6

Approach 1:
class Solution {
    public int maxFreqSum(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
     for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
           // System.out.println(map.get(s.charAt(i))+" "+s.charAt(i));
     }   
    String vowel="aeiou";
    int maxVowel=0;
    int maxConsonent=0;
    for(int i=0;i<s.length();i++){
        if(vowel.contains(String.valueOf(s.charAt(i)))){
            maxVowel=Math.max(maxVowel,map.get(s.charAt(i)));
           // System.out.println(map.get(s.charAt(i))+" "+s.charAt(i));
        }else{
            maxConsonent=Math.max(maxConsonent,map.get(s.charAt(i)));
            //System.out.println(map.get(s.charAt(i))+" "+s.charAt(i));
        }
    }
    return maxConsonent + maxVowel;
    }
}
Time complexity: O(N)+O(N) N-> string length
space complexity:O(1) hashmap contain maximum 26 character only

class Solution {
    public int maxFreqSum(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
     for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            System.out.println(map.get(s.charAt(i))+" "+s.charAt(i));
     } 
    System.out.println(map.size());  
    String vowel="aeiou";
    int maxVowel=0;
    int maxConsonent=0;
    for(Map.Entry<Character,Integer> entry:map.entrySet()){
        if(vowel.contains(String.valueOf(entry.getKey()))){
         maxVowel=Math.max(maxVowel,map.get(entry.getKey()));
        }else{
          maxConsonent=Math.max(maxConsonent,map.get(entry.getKey()))  ;
        }
    }
    return maxConsonent + maxVowel;
    }
}

Time complexity: O(N)+O(1) N-> string length
space complexity:O(1) hashmap contain maximum 26 character only
