package RecursionPractice;

public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(product(n));
    }
    public static int product(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10)*product(n/10);
    }

}
