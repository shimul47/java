import java.util.Scanner;

public class daimond {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to print 'Daimond': ");
    int n = sc.nextInt();
    advance_daimond(n);
}

public static void advance_daimond(int n) {
    int x=n;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for (int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for (int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for (int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
        }
        return;
        
    }
}
