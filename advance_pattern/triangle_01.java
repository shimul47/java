import java.util.*;
public class triangle_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i<n ; i++){
            for (int j = 0; j<=i; j++){
                if (i%2!=0){
                    if (j%2!=0){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                }
                else{
                    if (j%2==0){
                        System.out.print(1);
                    }else{
                        System.out.print(0);
                    }
                }
            }
            System.out.println();
        }
    }
}

