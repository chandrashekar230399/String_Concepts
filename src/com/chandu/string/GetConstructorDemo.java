package com.chandu.string;

import java.lang.reflect.Constructor;

import java.util.Scanner;

public class GetConstructorDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("enter the class name");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;

		Class<?> c = Class.forName(s);
		Constructor<?> constructor[] = c.getConstructors();
		System.out.println("List of " + s + "class constructors ");
		for (Constructor<?> constructor2 : constructor) {
			System.out.println(++count + "   " + constructor2);

		}

	}
}
