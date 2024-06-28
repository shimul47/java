import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        check_Palindrome(number);
    }
    public static void check_Palindrome(int n){
        int palindrome = n;
        int reverse = 0;
        while (palindrome!=0){
            int rem = palindrome%10;
            reverse = reverse*10+rem;
            palindrome/=10;
        }
        if (reverse==n){
            System.out.println("Palindrome");

        }else{
            System.out.println("Not a palindrome");
        }
    return;
    }
}
