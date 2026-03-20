Print nxn Star Square
Approach:
● Outer Loop (Rows): Run from i = 0 to i = n - 1
● Inner Loop (Columns): For each row, loop from j = 0 to j = n - 1
● Build Row String: Append *in each inner loop iteration.
● Print Row:After the inner loop, print the complete row string.
  
Time & Space Complexity:
Time Complexity:O(n^2)
Space Complexity:O(n)(temporary row string)

class starSquare {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            String row ="";
            for(int j=0;j<n;j++){
                row=row+"*";
            }
            System.out.println(row);
        }
    }
}

## Output
****
****
****
****
