public class butterfly_pattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print('*');
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print('*');
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        
    }
}

/*
//python//
 n=4
for i in range(1,n+1,1):
  for j in range(1,i+1,1):
    print("*"*i," "*2*(n-i),"*"*i)
    break
for i in range(n,-1,-1):
  for j in range(i+1,0,-1):
    print("*"*i," "*2*(n-i),"*"*i)
    break
 */
