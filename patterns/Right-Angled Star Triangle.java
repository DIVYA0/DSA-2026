Right-Angled Star Triangle
  
Approach:
● Outer Loop (Rows): Run a loop from i = 0 to i = n - 1. Each iteration represents one row.
● Inner Loop (Stars per Row): For each row irun another loop from j = 0 to j = iand append a *character to a string.
● Print Row:Print the string after the inner loop, completes for each row.
  
Time & Space Complexity:
Time Complexity:O(n^2)because the total number of stars printed is1+2+3+.......+n = n(n+1)/2.
Space Complexity:O(n)for the temporary string variable storing each row.

  
class starSquare {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            String row ="";
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

