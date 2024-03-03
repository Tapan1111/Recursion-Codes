package Recursion1;

public class FiboMemoization {
    public static void main(String[] args) {
        FiboMemoization fibonacci = new FiboMemoization();
        int ans = fibonacci.fib(7);
        System.out.println(ans);

    }
    public int fib(int n){
        if(n<=1){
            return n;
        }
        return memoize(n);
    }
    public int memoize(int n){
        int[] cache = new int[n+1];
        cache[1] = 1;
        for(int i=2; i<=n; i++){
            cache[i] = cache[i-1]+cache[i-2];
        }
        return cache[n];
    }
}
