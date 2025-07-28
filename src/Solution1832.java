
public class Solution1832 {
    public static boolean checkIfPangram(String sentence) {
        
    	String abc = "abcdefghijklmnopqrstuvwxyz";
    	
    	for(int i = 0; i< abc.length(); i++) {
    		
    		char letter = abc.charAt(i);
    		
    		if(!sentence.contains(String.valueOf(letter))) {
    			return false;
    		}
    		
    		
    	}
    	
    	return true;
    }

    
    public static void main(String[] args) {
    	
    	String s = "thequickbrownfoxxjumpsoverthelazydog";
    	System.out.println(checkIfPangram(s));
    }
    
}
