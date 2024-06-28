import java.util.*;
public class even_odd {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number to check 'even/odd': ");
        int x = sc.nextInt();
        if ((x&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
