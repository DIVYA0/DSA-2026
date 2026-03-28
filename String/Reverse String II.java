Reverse String II
The problem requires reversing the first k characters for every 2k characters in a string. If there are fewer than k characters left, reverse all of them. If there are between k and 2k characters left, reverse the first k and leave the rest as is.

Steps
Convert the string into a character array (if needed).
Iterate over the array in steps of 2k.
At each step, reverse the next k characters if available.
Join or return the modified string.
Dry Run
Input: s = "abcdefg", k = 2

First 2k = 4 chars: reverse first 2 → "bacd"
Remaining = “efg”: reverse first 2 → "fe", keep “g”
Output: "bacdfeg"

Time & Space Complexity
Time Complexity: O(n), where n = length of the string
Space Complexity: O(1) if in-place, else O(n)

class Solution {
    public String reverseStr(String s, int k) {
    char[] ch=s.toCharArray();
    for(int i=0;i<ch.length;i=i+(2*k)){
    int left=i;
    int right=Math.min(i+k-1,ch.length-1);
    while(left<right){
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
    }
    }
        return String.valueOf(ch);   
    }
}
