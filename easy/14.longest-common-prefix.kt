class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val output = ""
        outloop@ for(i in 1..strs.size-1){
            if (strs[0].first() != strs[i].first()){
                break@outloop
            }
        }
        return output
    }
}
