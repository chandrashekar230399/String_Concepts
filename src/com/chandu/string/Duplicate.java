package com.chandu.string;

public class Duplicate {

	public static void main(String[] args) {
		// converting char to string
		char[] arr = { 'c', 'h', 'a', 'n', 'd', 'u' };
		String str = new String(arr);
		System.out.println(str);

		// converting string to char
		String s = "chandu";
		char[] array = s.toCharArray();

		for (char ch : array) {
			System.out.println(ch +" ");
		}
		
//		String s1 ="hello";
//		String s2 ="world";
//		System.out.println(s1.concat(s2));
//		System.out.println(s1);
//		System.out.println(s2);
		
		String s1 ="hello";
		String s2 ="world";
		s2=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2);
	}
}
