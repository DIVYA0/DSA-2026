Bubble Sort
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
This process is repeated until the array is sorted.
After each pass, the largest unsorted element “bubbles up” to its correct position at the end of the array. It’s called “Bubble Sort”
As smaller elements slowly “bubble” to the top of the list.

Approach:
Iterate through the array multiple times.
In each pass, compare adjacent elements.
If the current element is greater than the next one, swap them.
After each pass, the largest unsorted element bubbles up to its correct position at the end.
Use a boolean flag (isSwapped) to track whether any swapping happened.
If no swaps occurred in a full pass, the array is already sorted → early exit (optimization).
Repeat this process for n - 1 passes (where n is the array length), or until no swaps are needed.
  
Time & Space Complexity:
Time Complexity: O(n) (Best Case) when array is already sorted (optimized with isSwapped).
Worst Case: O(n2) When array is in reverse order.
Space Complexity: O(1) In-place sorting, no extra space used.

class BubbleSort {
    public static void main(String[] args) {
     int[] arr={5,3,19,13,24,18,7};
     bubbleSort(arr);
     System.out.println("Sorted Array is ");
     for(int num:arr){
         System.out.print(num+" ");
     }
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean isSwapped =false;
            for(int j=0;j<arr.length-(i+1);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}

output
Sorted Array is 
3 5 7 13 18 19 24 
