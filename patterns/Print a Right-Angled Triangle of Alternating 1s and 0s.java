Print a Right-Angled Triangle of Alternating 1s and 0s
  
 Approach:
● Outer loop (Rows): Loopifrom0ton-1.
● Initialize toggle = 1:Start each row withtoggle = 1..
● Inner loop (Columns):For each row, loopjfrom 0toi. On each iteration:
Appendtoggleto the row string.
Fliptogglebetween 1 and 0.
● Print Row: After inner loop, print the row string.
  
Time & Space Complexity:
Time Complexity: O(n^2)
Space Complexity:O(n)per row 
  
class RightAngledTriangle_Alternating_1s_0s {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            String row ="";
            int toggle=1;
            for(int j=0;j<=i;j++){
                row=row+toggle;
                toggle=(toggle==1)?0:1;
            }
          
            System.out.println(row);
        }
    }
}


Output
1
1 0
1 0 1
1 0 1 0
