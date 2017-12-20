package quiz;

import java.util.ArrayList;

public class ReverseString {
	
    public String reverse(String input) {
    	
    	String[] splitLetters = input.split("(?!^)");
    	int iterLimit = splitLetters.length;
    	String finalizedReverse = null;
    	
    	
    	for (int itr = iterLimit-1; itr >= 0; itr--) {
    		System.out.println("Currently on iteration:" + iterLimit);
    		finalizedReverse += splitLetters[itr];
    	}
    	
    	return finalizedReverse;
        //return new StringBuffer(input).reverse().toString();
    }
    
}