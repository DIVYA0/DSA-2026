print numbers from 1 to N

class PrintOneTnN {
    public static void main(String[] args) {
       int a=5;
       fun (a);
    }
    public static void fun(int a){
        if(a<1){
            return;
        }
        fun(a-1);
        System.out.println(a);
    }
}

🔹 Important concept
👉 Print after recursive call → increasing order (1 to n)
👉 Print before recursive call → decreasing order (n to 1)
Winding is the phase where recursive calls are made
unwinding is the phase where calls return and execution resumes.
