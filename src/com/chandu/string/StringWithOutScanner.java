package com.chandu.string;

import java.util.Arrays;

public class StringWithOutScanner {

	public static void main(String[] args) {
		String str = new String("java is super");
		String revStr = " ";
		System.out.println(str.length());
		System.out.println(str.split(" ").length);
		int remove= (str.replace("a", "").length());
		int count = str.length()-remove;
		System.out.println(count);
		
		for(int i=str.length()-1;i>=0;i--) {
			revStr = revStr+str.charAt(i);
			
		}
		System.out.println(revStr);
		
		String s = "<space><space><space>hello<space>world<space><space>";
		int re =(s.replace("<space>"," ").length()    );
		System.out.println(re);
	}


}
