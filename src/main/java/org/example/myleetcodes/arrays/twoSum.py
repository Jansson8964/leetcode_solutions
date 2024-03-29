from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        preMap = {}  # val : index
        for i, n in enumerate(nums):
            diff = target - n
            if diff in preMap:
                return [preMap[diff], i]
            preMap[n] = i
        return
