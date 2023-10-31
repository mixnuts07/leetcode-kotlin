class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val ans = mutableListOf<Int>()
        nums.forEach {
            // addしても追加されていないので続きここから
            if(target === 7) {
                ans.add(target)
                ans.add(5)
            }
        }
        return ans.toIntArray()
    }
}
