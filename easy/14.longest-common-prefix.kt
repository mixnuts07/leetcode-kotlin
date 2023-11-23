class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
    var output = ""
    when (strs[0].length) {
        0 -> output = ""
        else {
            outloop@ for(i in 1 until strs.size){ 
                for(j in 0..strs[i].length){
                    if (strs[0].first() != strs[i].first()) {
                        output = ""
                        break@outloop
                    } 
                    else if(strs[0].substring(0,j) == strs[i].substring(0,j)) {
                        output = strs[0].substring(0,j)
                    }    
                }

                }
            }
        }
        return output
    }
    fun longestCommonPrefix(strs: Array<String>) {
        for(i in 0 until strs.size) {
            // strs[0].commonPrefixWith(strs[])
                println(i)
        }
    }
}
