sum of all elements in an array using recursion in Java:

class ArraySumRecursion  {
    public static void main(String[] args) {
       int[] arr={13,10,21,42,55};
       System.out.println("Sum is " +sum(arr,arr.length-1));
    }
    public static int sum(int[] arr,int i){
      if(i<0){
          return 0;
      }    
      return arr[i]+sum(arr,i-1); 
    }
}

output
Sum is 141
