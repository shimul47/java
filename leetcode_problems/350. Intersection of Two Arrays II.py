class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        listt=[]
        for i in range(len(nums1)):
            for j in range(len(nums2)):
                if nums1[i] == nums2[j]:
                    listt.append(nums1[i])
                    nums2[j]=-1
                    break             
        return listt
# this in an unoptimized solution due to time shortage