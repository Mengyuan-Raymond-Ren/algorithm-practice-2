public class Solution {
    public boolean isValid(String s) {
		if(s.length() % 2 == 1 || s.length() == 0)
			return false;
		
		Stack<Character> all = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '}') {
        		if(all.size() == 0 || ((char)(all.pop())) != '{') {
        			return false;
        		}
        	}
        	else if(s.charAt(i) == ']') {
        		if(all.size() == 0 || ((char)(all.pop())) != '[') {
        			return false;
        		}
        	}
        	else if(s.charAt(i) == ')') {
        		if(all.size() == 0 || ((char)(all.pop())) != '(') {
        			return false;
        		}
        	}
        	else {
        		all.push((Character)s.charAt(i));
        	}
        	
        	for(int j = 0; j < all.size(); j++) {
        	    System.out.print(all.peek());
        	}
        	System.out.print("\n");
        }
    	
    	if(all.size() == 0) {
    	    return true;
    	}
    	else {
    	    System.out.print("Here");
    	    return false;
    	}
    }
}
