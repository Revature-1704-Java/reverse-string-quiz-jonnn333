package quiz;

import java.util.ArrayList;

public class ReverseString {
	
    public String reverse(String input) {
    	
    	// local variables to break string apart
    	String[] splitLetters = input.split("(?!^)");
    	int iterLimit = splitLetters.length;
    	String finalizedReverse = "";
    	
    	// reverse for-loop (minus 1 b/c start-from-zero convention)
    	for (int itr = iterLimit-1; itr >= 0; itr--) {
    		//System.out.println("Currently on iteration:" + itr);
    		finalizedReverse += splitLetters[itr];
    	}
    	
    	// see if string is actually reversed
    	//System.out.println("final reversed word is |"+finalizedReverse+"|" );
    	return finalizedReverse;
    	
    	// old return statement; not allowed to use for challenge
        //return new StringBuffer(input).reverse().toString();
    }
    
}