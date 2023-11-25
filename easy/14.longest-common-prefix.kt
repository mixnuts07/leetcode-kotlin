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
    fun longestCommonPrefix(strs: Array<String>): String {
        var tmp = ""
        var output = ""
        if(strs.size == 1) {
            return strs[0]
        }
        for(i in 1 until strs.size) {
            tmp = strs[0].commonPrefixWith(strs[i])
            if(tmp == ""){
                output = ""
                break
            }
			if (output.length == 0 || output.length > tmp.length) {
                output = tmp
            }
        }
        return output
    }
}
