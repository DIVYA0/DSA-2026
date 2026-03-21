Solution for infinite Loop- write base case

class infiniteRecursion {
    public static void main(String[] args) {
       int a=10;
       fun (a);
    }
    public static void fun(int a){
        if(a==0) return;
        System.out.print(a+" ");
        a--;
        fun(a);
    }
}

output
10 9 8 7 6 5 4 3 2 1 
