public class reverse_array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        reverse(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[]) {
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return;
    }
}
