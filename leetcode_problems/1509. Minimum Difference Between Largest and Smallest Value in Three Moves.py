class Solution:
    def minDifference(self, nums: List[int]) -> int:
        if (len(nums)<=4):
            return 0
        nums.sort()
        max=9999999999
        for i in range(4):
            max = min(max, nums[-(4-i)]-nums[i])
        return max
        