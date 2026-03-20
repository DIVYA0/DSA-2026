Right-Angled Triangle of Alternating 1s and 0s (Global Toggle)
  
  Approach:
● Global Toggle Variable: Declaretoggle = 1before the outer loop.
● Outer Loop:Loopifrom0ton-1.
● Inner loop:Loopjfrom0toi.On each iteration:
● Append:toggleto the row string.
● Flip:toggle1 -> 0and0 -> 1.
● Print the Row: after the inner loop.
Key Difference:
In the previous pattern, toggle = 1was reset each row. Here, the toggle continues globally across the entire pattern.

Time & Space Complexity:
Time Complexity: O(n^2)
Space Complexity:O(n)per row.

  class GlobalToggleTriangle  {
    public static void main(String[] args) {
        int n=4;
        int toggle=1;
        for(int i=0;i<n;i++){
            String row ="";
            
            for(int j=0;j<=i;j++){
                row=row+toggle;
                toggle=(toggle==1)?0:1;
            }
          
            System.out.println(row);
        }
    }
  Output
1
0 1
0 1 0
1 0 1 0
}
