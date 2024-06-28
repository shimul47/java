public class x_power_n {

    public static void main(String[] args) {
        int x =3;
        int n = 433852;
        System.out.println(power(x,n)%1337);
    }
    public static int power(int x, int n){
        if (n==0){
            return 1;
        }
        int temp = power(x,n/2);
        if (n%2!=0){
            return (x*temp*temp);
        }
        return temp*temp;
    }
}
