public class calculate {
    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }

    public static int bionomial(int n,int r){
        int x=factorial(n);
        int y=factorial(r);
        int sum =x/(y*(factorial(n-r)));
        return sum;
    }

    

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(bionomial(5,2));
        
    }
}
