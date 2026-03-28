Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Approach 1:
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        String reverseString=new StringBuilder(s).reverse().toString(); 
        return s.equals(reverseString);
    }

Approach 2:
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String filterString="";
       String reverseString="";
       for(int i=0;i<s.length();i++){
        if(Character.isLetterOrDigit(s.charAt(i))){
            filterString=filterString+s.charAt(i);
            reverseString=s.charAt(i)+reverseString;
    //    System.out.println(filterString+" "+reverseString);
        }
       }
       return filterString.equals(reverseString);
    }
}

Time Complexity:O(N);
space Complexity:O(N);

Approach 3-No extra space
class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        s=s.toLowerCase();
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            else if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
 Time complexity O(N)
space complexity O(1)
