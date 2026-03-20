Merge Sort
Merge Sort is a popular divide-and-conquer sorting algorithm that divides the input array into two halves, recursively sorts them, and then merges the sorted halves into one sorted result.
It is an example of a stable sort that guarantees O(n log n) performance in all cases — best, worst, and average.

Approach:
Divide: Split the array into two halves.
Conquer: Recursively sort each half using merge sort.
Combine: Merge the two sorted halves into one sorted array.
Key Concept: Merge Step
The key step is merging two sorted arrays efficiently into one sorted array.
This is done using a two-pointer approach, comparing elements from both arrays and adding the smaller one into a new result array.
  
Time & Space Complexity:
Time Complexity: O(n log n) Divide takes log n steps and merging takes linear time.
Space Complexity: O(n) Additional space is needed to store the merged arrays.

import java.util.Arrays;
class MergeSort {
    public static void main(String[] args) {
        int[] arr={4, 5, 1, 3, 9,2,2};
        int res[]=mergeSort(arr);
        for(int num:res)
        System.out.print(num+" ");
    }
    public static int[]  mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=mergeSort(Arrays.copyOfRange(arr,0 ,mid));
        int right[]=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int i=0,j=0,k=0;
        int[] res=new int[left.length+right.length];
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                res[k]=left[i];
                k++;
                i++;
            }else{
                res[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length){
            res[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            res[k]=right[j];
            k++;
            j++;
        }
        return res;
    }
}  

output:
1 2 2 3 4 5 9 
