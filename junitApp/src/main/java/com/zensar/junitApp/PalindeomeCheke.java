package com.zensar.junitApp;

public class PalindeomeCheke {

	public Boolean isPalindrom(String s) {
		String reverse="";
		int length=s.length();
		for(int i=length-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		if(s.equals(reverse)) {
			return true;
		}else {
			return false;
		}
	}
}
