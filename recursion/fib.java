public class fib {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibonacci(n));

    }
    public static int fibonacci(int n){
        if (n==1 || n==0){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
