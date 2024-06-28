public class pairs_in_arr {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        pairs(arr);
        int total_pair=(arr.length*(arr.length-1))/2;
        System.out.println("Total pair is :"+total_pair);
    }
    public static void pairs(int arr[]) {
        int count1=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count1++;
            }
            System.out.println();
        }
        System.out.println(count1);
        
    }
}
