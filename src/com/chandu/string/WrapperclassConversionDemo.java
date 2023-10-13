package com.chandu.string;

public class WrapperclassConversionDemo {

	public static void main(String[] args) {
		Integer i = new Integer(1);
		Integer i1 =Integer.valueOf("1");
		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());
		Character ch =  Character.valueOf('a');
		System.out.println(ch.hashCode());
		//primitive String
		//tostring static method in ever wrapper class
		String s = Integer.toString(10000,2000);
		System.out.println(s.length());
		String s1 = Character.toString('c');
		System.out.println(s1.hashCode());
		
		
		
		int primitiveint =i.intValue();
		float primitivefloat =i.floatValue();
		double primitivedouble =i.doubleValue();
		System.out.println(primitiveint+" "+primitivefloat+" "+primitivedouble);
		
		//converting from string to primitive
		//conversion from string to wrapper
		
	}

}
