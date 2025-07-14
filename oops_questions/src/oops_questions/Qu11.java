package oops_questions;
class Solution{
	    public String repeatLastNCharacters(String str, int n) {
	        if (n < 0 || n > str.length()) {
	            throw new IllegalArgumentException("n must be between 0 and the length of the string, inclusive.");
	        }

	        String lastN = str.substring(str.length() - n);
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(lastN);
	        }
	        return result.toString();
	    }
    public class Qu11{
	    public static void main(String[] args) {
	        Solution solution = new Solution();
	        String str = "Wipro";
	        int n = 3;
	        String result = solution.repeatLastNCharacters(str, n);
	        System.out.println(result);
	    }
    }
}      
      
	
  


