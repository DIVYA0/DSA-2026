Print a Reverse Right-Angled Triangle of Increasing Numbers.java
Approach:
● Outer loop (Rows): Loopifrom0 to n - 1.Each iteration represents a row.
● Inner loop (Print Numbers):For each row, loopjfrom0to n-i-1 and append j+1to a row string.
● Print Row: After the inner loop, print the row string.
  
Time & Space Complexity:
Time Complexity: O(n^2)
Space Complexity:O(n)for the temporary row string.

 class ReverseRightAngledTriangle_IncreasingNumbers {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            String row ="";
            for(int j=0;j<n-i;j++){
                row=row+(j+1);
            }
            System.out.println(row);
        }
    }
}

Output
1 2 3 4
1 2 3
1 2
1
