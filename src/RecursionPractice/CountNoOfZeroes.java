package RecursionPractice;

public class CountNoOfZeroes {
    public static int countZero(int n){
        return helper(n,0);

    }

    private static int helper(int n, int c) {
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }

    public static void main(String[] args) {
        int n = 30204;
        System.out.println(countZero(n));
//        System.out.println(countZero(n,0));

    }
}
