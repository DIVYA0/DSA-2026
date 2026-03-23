Problem Statement:
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same. 
Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k. To get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially.
The remaining elements of nums are not important, as well as the size of nums. eturn k.

class RemoveDuplicates {
    public static void main(String[] args) {
       int[] arr={ 0,0,1,1,1,2,2,3,3,4,4,5};
       System.out.println(RemoveDuplicates(arr));
    }
    public static int RemoveDuplicates(int[] arr){
        int x=0;
        int n=arr.length-1;
        for(int i=0;i<=n;i++){
            
            if(arr[x]<arr[i]){
                x=x+1;
                arr[x]=arr[i];
            }
        }
        return x+1;
    }
}

output:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
