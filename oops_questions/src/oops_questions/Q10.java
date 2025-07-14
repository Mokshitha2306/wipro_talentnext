package oops_questions;

public class Q10 {
	    public String stringX(String str) {
	        if (str.length() == 0) {
	            return str;
	        }

	        int start = 0;
	        int end = str.length();

	        if (str.charAt(0) == 'x') {
	            start = 1;
	        }

	        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
	            end = str.length() - 1;
	        }

	        return str.substring(start, end);
	    }
	}
