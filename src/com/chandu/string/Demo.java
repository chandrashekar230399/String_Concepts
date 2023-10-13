package com.chandu.string;

public class Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.toString();
		d.hashCode();
		
		String s = new String();
		int u =1;
		String t="1";
		Integer i = new Integer(5);
		Integer i2 = new Integer("5");//true  //("five"); note: number format exception
		System.out.println(i.equals(i2));//true
		 
		Boolean b = new Boolean(false);//false
		Boolean b1 = new Boolean("false");//false
		Boolean b2 = new Boolean("Wrong");//false
		Boolean b3 = new Boolean("true");//Other than true any thing is-it will consider as false only
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		Boolean bb = new Boolean(true);//true
		Boolean bb1 = new Boolean("True");//true
		Boolean bb2 = new Boolean("Right");//false
		
		System.out.println(bb);
		System.out.println(bb1);
		System.out.println(bb2);
		
	}

}
