package RecursionPractice;

public class PrintNumbers {
    public static void main(String[] args) {
        printNum(1);

    }
    public static void printNum(int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        printNum(n+1);
//        System.out.println(n);


    }


}
