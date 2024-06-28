public class function_overloading {
    public static int sum(int a ,int b){
        return a+b;
    }

    public static int sum(int a ,int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }        
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void prime_series(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        return;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sum(1,5,3));
        System.out.println(sum(5.1f,6.3f));
        System.out.println(isPrime(53));
        prime_series(53);
    }
}
