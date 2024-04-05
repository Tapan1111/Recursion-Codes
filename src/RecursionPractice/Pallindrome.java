package RecursionPractice;

public class Pallindrome {
    static int reverse1(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);

    }
    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
    static boolean palin(int n){
        return (n == reverse1(n));
    }




    public static void main(String[] args) {
        int n  =121;
//        reverse(n);
//        System.out.println(sum);
        System.out.println(palin(n));

    }
}
