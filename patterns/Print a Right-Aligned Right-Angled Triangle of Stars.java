Print a Right-Aligned Right-Angled Triangle of Stars

Approach:
● Outer loop (Rows): Loopi = 0from0ton-1.Each iteration is a new row.
● Inner loop 1(Spaces):For each row, addn - i - 1spaces before the stars to right-align the triangle.
● Inner loop 2(Stars):Addi+1stars after the spaces.
● Print Row: Combine the spaces and stars, then print the row.
  
Time & Space Complexity:
Time Complexity: O(n^2)
Space Complexity:O(n)for the row string.  

class Right_Aligned_RightAngledTriangle_Stars {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            String row ="";
            for(int j=0;j<n-i-1;j++){
                row=row+" ";
            }
            for(int j=0;j<=i;j++){
                row=row+"*";
            }
            System.out.println(row);
        }
    }
}

Output
      *
    * *
  * * *
* * * *
