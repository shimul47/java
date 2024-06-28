import java.util.*;
public class hollow_rhambus {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to print 'Rhombus': ");
    int n = sc.nextInt();
    Rhombus(n);
    }

public static void Rhombus(int n) {       
    for (int i=1;i<=n;i++){
        for (int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            if (i==1 || i==n ||j==1 ||j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    return;
    
    }
    
}