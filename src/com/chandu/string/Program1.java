package com.chandu.string;

public class Program1 {

	public static void main(String[] args) {
		String s = "Chandu@#!%&^$^&^*&^";
		int length = s.length();

		String specialCharactersRemoved = " ";
		int count = 0;

		for (int i = 0; i <length; i++) {
			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
			}
			else {
				specialCharactersRemoved = specialCharactersRemoved+s.charAt(i);
				
			}
			
		}
		System.out.println("specialCharactersRemoved"+specialCharactersRemoved);
		
		if (count == 0) {
			System.out.println("special characters are not found");
		} else {
			System.out.println("special are found" + count);
		}

	}

}
