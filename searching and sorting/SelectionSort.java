Selection Sort
Selection Sort is a simple comparison-based sorting algorithm.
It divides the array into two parts: a sorted subarray and an unsorted subarray.
Initially, the sorted part is empty, and the unsorted part is the entire array.
In each iteration, it finds the minimum element from the unsorted part and moves it to the end of the sorted part.

Approach:
Iterate over the array from index 0 to n-2.
For each index i, assume the element at i is the minimum in the unsorted part.
Run an inner loop from j = i+1 to n-1 to find the actual minimum element.
If a smaller element is found, update the min index.
After the inner loop, swap the element at i with the element at min (if they’re not the same).
Repeat until the array is sorted.
  
Time & Space Complexity:
Time Complexity: O(n2) In all cases best, average and worst.
Roughly n*(n-1)/2 comparisons are always performed.
Space Complexity: O(1) Selection Sort is an in-place sorting algorithm, so it doesn’t require extra space.

class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4, 5, 1, 3, 9};
        selectionSort(arr);
        System.out.println("storted  array is ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
          if(i!=min){  
          int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;  
          }
        }
    }
}
  
Example 1:
Input: [4, 5, 1, 3, 9]
Output: [1, 3, 4, 5, 9]
