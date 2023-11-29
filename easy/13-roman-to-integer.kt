    fun romanToInt(s: String): Int {
    	var output = 0
	    val romanNumerals = mapOf(
    		"I" to 1,
	    	"V" to 5,
	 	    "X" to 10,
    		"L" to 50,
		    "C" to 100,
    		"D" to 500,
	   	    "M" to 1000
    	)
        for(i in 0 ..s.length-1){
        	output += romanNumerals.get(s.substring(i,i+1))?.toInt() ?: 0
        }
        println(output)
    	return output
	}
