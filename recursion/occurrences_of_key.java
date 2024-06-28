public class occurrences_of_key {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key = 2;
        check_and_print(arr,key,0);
        
    }
    public static void check_and_print(int arr[],int key,int idx){
        if (idx==arr.length){
            return;
        }
        if (arr[idx]==key){
            System.out.print(idx+" ");
        }
        check_and_print(arr,key,idx+1);
    }
}
