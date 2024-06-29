class Solution {
    public int search(int[] nums, int target) {
        return search (nums, target, 0, nums.length-1);
    }
    public static int search(int arr[],int target, int si, int ei){
        int mid = si + (ei-si)/2;
        if (si>ei){
            return -1;
        }
        if (arr[mid] == target){
            return mid;
        }
        if (target>arr[mid]){
            return search(arr,target,mid+1,ei);
        }
        else{
            return search(arr,target,si,mid-1);
        }
    }
}