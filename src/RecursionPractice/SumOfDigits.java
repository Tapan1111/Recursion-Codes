package RecursionPractice;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 13425;
        System.out.println(sumOfDigits(n));

    }
    public static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
//        int rem = n%10;
//        n = n/10;
        return (n%10)+sumOfDigits(n/10);
    }

}
