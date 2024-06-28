public class binary_to_dec {
public static void main(String[] args) {
    int n = 101;
    int x = 0;
    int count = 0;
    while (n>0){
        int rem=n%10;
        x+=rem*((int)Math.pow(2,count));
        n/=10;
        count++;

    }
    System.out.println(x);
    }  
}