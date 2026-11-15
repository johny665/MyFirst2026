package org.jav;

public class Ems {
	
	public static void main(String[] args) {
		String s = "Lissome gents pg";
		System.out.println(s);
		
		char charAt = s.charAt(8);
		System.out.println(charAt);
		
	   int indexOf = s.indexOf("e");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
		int length = s.length();
		System.out.println(length);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contains = s.contains("t");
		System.out.println(contains);
		
		boolean startsWith = s.startsWith("Lissome");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("pg");
		System.out.println(endsWith);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		String replace = s.replace('L', 'H');
	    System.out.println(replace);
	    
	    String replaceAll = s.replaceAll("gents", "girls");
		System.out.println(replaceAll);
		
		String substring = s.substring(8);
		System.out.println(substring);
		
		String substring2 = s.substring(8, 13);
		System.out.println(substring2);
		
		String s2 = " Missome all pg";
		System.out.println(s2);
		
		boolean equals = s2.equals(s);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s2.equalsIgnoreCase(s);
		System.out.println(equalsIgnoreCase);
		
		String b = "john"; //a 97 
		
		String y = "peter"; // z 122
		
		int compareTo = b.compareTo(y);
	    System.out.println(compareTo);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
