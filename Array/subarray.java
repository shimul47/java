public class subarray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        sub(arr);
        int total_sub_arr=(arr.length*(arr.length+1)/2);
        System.out.println("Total Sub_Array is: "+total_sub_arr);
    }
    public static void sub(int arr[]) {
        int count=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    
                }
                System.out.println();
                count++;
            }
        }
        System.out.println("total: "+count);
    }
}
