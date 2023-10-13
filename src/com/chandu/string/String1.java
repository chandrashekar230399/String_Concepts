package com.chandu.string;


import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string name:");
		String s1 = sc.nextLine();
		
		System.out.println(s1.length());//11
		System.out.println((s1.split(" ").length));//hello world =2 
		int remove =(s1.replace("l","").length());
		System.out.println(remove);//8
		int count=s1.length()-remove;//11-8=3
		System.out.println(count);
		
		
		
	}

}
