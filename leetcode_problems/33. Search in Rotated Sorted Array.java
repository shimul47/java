class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }

    public int search(int nums[], int target, int si, int ei){
        int mid = si + (ei-si)/2;
        if (si>ei){
            return -1;
        }
        if (nums[mid] == target){
            return mid;
        }
        if(nums[si] <= nums[mid]){
            if(nums[si]<=target && target<=nums[mid]){
                return search(nums,target,si,mid-1);
            }else{
                return search(nums,target,mid+1,ei);
            }
        }
        else{       
            if (nums[mid]<=target && target<=nums[ei]){
                return search(nums,target,mid+1,ei);
            }else{
                return search(nums,target,si,mid-1);
            }
        }
        
    }
}