package com.chandu.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String ("chandu");
		String s2 = new String ("chandu");
		System.out.println("THIS IS STRING:");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer ss = new StringBuffer("java");
		StringBuffer s1s = new StringBuffer("java");
		System.out.println("THIS IS STRINGBUFFER:");
		System.out.println(ss==s1s);
		System.out.println(ss.equals(s1s));
		
		StringBuilder s3 = new StringBuilder("hello");
		StringBuilder s4 = new StringBuilder("hello");
		System.out.println("THIS IS STRINGBUILDER:");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		    
	}

}
