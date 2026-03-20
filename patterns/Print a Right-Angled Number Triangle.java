Approach:
● Outer loop (Rows): Run a loop from i = 0to i < n.Each iteration represents a new row.
● Inner loop (Numbers):Run an inner loop from j = 0to j <= i, and append j+1to the row.
● Build and Print: Construct a string for the row and print it after the inner loop ends.
  
Time & Space Complexity:
Time Complexity: O(n^2)Each row can have up to nnumbers.
Space Complexity:O(n)Temporary string to build each row.

class Right_Angled_Number {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            String row ="";
            for(int j=0;j<=i;j++){
                row=row+(j+1);
            }
            System.out.println(row);
        }
    }
}

Output
1
1 2
1 2 3
1 2 3 4
