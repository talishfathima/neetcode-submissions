class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq={}
        for ele in nums:
            freq[ele]=freq.get(ele,0)+1

        items = list(freq.items())
        items.sort(key=lambda x: x[1] , reverse=True)
        return [x[0] for x in items[:k]]