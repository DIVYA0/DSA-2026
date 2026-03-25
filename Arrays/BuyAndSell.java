Best Time to Buy and Sell Stocks
Problem Statement:
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Examples:
Example 1:
Input:prices = [7, 1, 5, 3, 6, 4]
Output:5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 – 1 = 5.

Example 2:
Input:prices = [7,6,4,3,1]
Output:0
Explanation: Explanation: In this case, no transactions are done and the max profit = 0.

class BuyAndSell {
    public static void main(String[] args) {
       int[] arr={7,8,1,5,4,2,7,10};
       System.out.println(buyAndSell(arr));
    }
    public static int buyAndSell(int[] arr){
      int min=arr[0];
      int profit=0;
      for(int i=1;i<=arr.length-1;i++){
          if(arr[i]-min>profit){
              profit=arr[i]-min;
          }
          if(arr[i]<min){
              min=arr[i];
          }
          
      }
      return profit;
    }
}

Time Complexity:
Time Complexity = O(n2) Two nested loops. For every element i, check all j > i. Total comparisons = n(n-1)/2 → O(n²)

Space Complexity:
Space Complexity = O(1) No extra data structures used. Only uses a variable maxProfit.
