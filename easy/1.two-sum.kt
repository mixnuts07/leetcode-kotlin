class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val list = mutableListOf<Int>()
        outloop@ for(x in 0..nums.size-1) {
            for(y in x+1..nums.size-1) {
                if(target == nums[x] + nums[y]) {
                    list.add(x)
                    list.add(y)
                    break@outloop
                }
            }
        }
        return list.toIntArray()
    }
}
