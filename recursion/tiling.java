public class tiling {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(tiling_shape(n));
    }
    public static int tiling_shape(int n){//2*n
        if (n==0 || n==1){
            return 1;
        }
        int vertical=tiling_shape(n-1);
        int horizon=tiling_shape(n-2);
        return vertical+horizon;
    }
}
