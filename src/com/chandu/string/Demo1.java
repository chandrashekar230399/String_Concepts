package com.chandu.string;


import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		String s1 = "chandu";// it will goes to garbage collector
		String s2 = "java";
		s1 = s1.concat(s2);
		System.out.println(s1);

		StringBuilder sb = new StringBuilder("chandu");
		sb.append("rockzz");
		System.out.println(sb);

		String t2 = "chandu";// it will goes into pool memory directly
		String y2 = "chandu";

		String t1 = new String("chandu");// it will goes to heap area memory
		String y1 = new String("chandu");

		System.out.println(new Demo1());// package-name+getclassname+@+hashcode.
		System.out.println(new Demo1()); //if we give again different hashcode will come.
		 
		System.out.println(t2 == y2);// true
		System.out.println(t2.equals(y2));// true

		System.out.println(t1 == y1);// false
		System.out.println(t1.equals(y1));// true

		StringBuffer t = new StringBuffer("jashvika");// false
		StringBuffer y = new StringBuffer("jashvika");// false

		System.out.println(t == y);
		System.out.println(t.equals(y));

		StringBuilder m = new StringBuilder("yash");
		StringBuilder n = new StringBuilder("yash");

		System.out.println(m == n);// false
		System.out.println(m.equals(n));// false

		String s = "ChaNdu";// upper&lower
		String str = "chandu";// lower
		String st = "CHANDU";// upper
		
		System.out.println(s.equals(str));//false
		System.out.println(s==str);//false
		System.out.println(s.equalsIgnoreCase(str));//true //it will ignore the case and checks the data weather same or not.

		System.out.println(s.toLowerCase());
		System.out.println(str.toLowerCase());
		System.out.println(st.toLowerCase());

		System.out.println(s.toUpperCase());
		System.out.println(str.toUpperCase());
		System.out.println(st.toUpperCase());
		
		System.out.println(s.contains("a"));//true because it contains that's letter
		System.out.println(s.contains("g"));// false because it doesnot contains that's letter
		
		System.out.println(s.contains("Ch"));//true it contains same case it will check upper or lower case also
		System.out.println(s.startsWith("Ch"));//true
		System.out.println(s.endsWith("du"));//true
		
		
		String name = " ch chandra Shekar srinivasa varma   ";
		System.out.println(name.length());
		System.out.println(name.trim());
		System.out.println(name.trim().length());
		System.out.println(name.toCharArray());
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		
		System.out.println(name.trim().substring(11,20));
		
		System.out.println(Arrays.toString(name.split("")));//one one letter(alphabet)
		System.out.println(Arrays.toString(name.split(" ")));//one word
		//System.out.println(Arrays.toString(name.split("\\@")));
		System.out.println(name.charAt(32));
		System.out.println(name.replace("chandra","chandu "));
		System.out.println(name.replaceAll("chandra","ch" ));
		
		String num ="786437832";
		System.out.println(Integer.valueOf(num));//converting string to int
		 
		int num1 = 56754;
		System.out.println(String.valueOf(num1));//converting int to string
		
		String e1 ;
		String e2="";//true because it is empty and length is 0
		String e3=" ";//false because it is not empty and length is 1
		System.out.println(e2.isEmpty());//true
		System.out.println(e3.length());//1
		System.out.println(e2.isBlank());//true
		System.out.println(e3.isEmpty());//false
		System.out.println(e3.isBlank());//true it contains white spaces but isempty won't allow white spaces
		 
	}

}
