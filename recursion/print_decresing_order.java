public class print_decresing_order {
    public static void main(String[] args) {
    int n = 50;
    order_wise_print(n);
    }
    public static void order_wise_print(int n){
        System.out.print(n+" ");
        if (n==1){
            System.out.println(n+" ");
            
            return;
        }
        order_wise_print(n-1);
        System.out.print(n+" "); //increasing order
    } 
}
