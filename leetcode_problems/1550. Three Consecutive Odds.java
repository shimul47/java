class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        return threeConsecutiveOdds(arr, 0);
    }
    public boolean threeConsecutiveOdds(int arr[], int i){
        if (i==arr.length-2 || arr.length <=2){
            return false;
        }
        if (arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
            return true;
        }
        else{
            return threeConsecutiveOdds(arr,i+1);
        }
    }
}