class Solution {
    fun removeElement(nums: IntArray, num: Int): Int {
        var output = 0
        for (i in 0 until nums.size) {
          		if(num == nums[i]) {
					output += 1
        		}
        }
        return output
    }
}
