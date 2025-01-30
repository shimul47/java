public class subarrySum {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        sub(nums,4);
        
        
    }
    public static void sub(int nums[],int n) {
        int []arr = new int [n*(n+1)/2];
        int count = 0;
        for (int i=0;i<nums.length;i++){
            int temp =0;
            for(int j=i;j<nums.length;j++){
                if(i == j){
                    arr[count]=nums[i];
                    temp=nums[i];
                }
                else{
                    arr[count]=temp+nums[j];
                    temp=arr[count];
                }
                count++;
            }
        }
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
