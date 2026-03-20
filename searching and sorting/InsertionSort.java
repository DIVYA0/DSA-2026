Insertion Sort
Insertion Sort is a simple and intuitive sorting algorithm that builds the final sorted array one element at a time.
It works by taking each element from the input and inserting it into its correct position in the already sorted part of the array.
Starting from the second element, it compares the current element with the previous ones, shifting larger elements one position ahead to make space for the current element.
This process continues until all elements are sorted.
Insertion Sort is efficient for small or nearly sorrted datasets and operates in-place without requiring extra memory.

Approach:
Start from the second element (index 1) since the first element is trivially “sorted”.
Store the current element (curr) and compare it with all previous elements.
Shift the previous elements one position forward if they are greater than the current element.
Insert the current element (curr) at its correct sorted position.
Repeat until the whole array is sorted.
    
Time & Space Complexity:
Time Complexity: O(n) Best Case Already Sorted.
Average Case: O(n2)
Worst Case: O(n2)Every element has to be compared and shifted back to the start.
Space Complexity: O(1) No extra array is used; sorting is done in-place

class InsertionSort {
    public static void main(String[] args) {
        int[] arr={18,13,15,7,10,9};
        InsertionSort(arr);
        System.out.println("sorted array are ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    
    }
    public static void InsertionSort(int[] arr){
        int n=arr.length;    
        for(int i=1;i<n;i++ ){
           int curr=arr[i];
           int prev=i-1;
           while(prev >=0 && arr[prev]>curr  ){  
               arr[prev+1]=arr[prev];
               prev=prev-1;
           }
           arr[prev+1]=curr;
        }
    }
}

output:
sorted array are 
7 9 10 13 15 18
