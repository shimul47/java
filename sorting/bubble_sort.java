public class bubble_sort {
    public static void main(String[] args) {
        int arr[] = {1,3,5,67,54,43,56,34,2,32,55,98};
        bubbleSort(arr);
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            boolean flag = false;
            for (int j =0; j<arr.length-1-i;j++){
                if (arr[j]>arr[i]){
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i] =  temp;
                    flag = true;
                }
            }
            if (flag==false){
                break;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return;
    }
}
