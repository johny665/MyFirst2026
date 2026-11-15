package org.jav;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collect {
	
	public static void main(String[] args) {
		
		List li = new ArrayList() ;
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add("java");
		li.add("many");
		li.add(30);
		
		System.out.println(li);
		
		int size = li.size();
		System.out.println(size);
		
		int indexOf = li.indexOf(30);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(50);
		System.out.println(lastIndexOf);
		
		
		boolean contains = li.contains(30);
		System.out.println(contains);
		
		li.remove("many");
		System.out.println(li);
		
		Object object = li.get(5);
		System.out.println(object);
		
	// list
		
		List<Integer> l = new LinkedList<> ();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		
		System.out.println(l);
		
		 l.retainAll(li);
		System.out.println(l);
		
		//l.removeAll(li);
		System.out.println(l);
		
		l.addAll(li);
		System.out.println(l);
		
		System.out.println("for loop");
		
	for (int i = 0; i < l.size(); i++) {
		System.out.println(l.get(i));
	}
		// 
		System.out.println("For Each");
		for (int i : l) {
			System.out.println(i);
		}
		
		//
			l.clear();
			System.out.println(l);
			
			boolean empty = l.isEmpty();
		    System.out.println(empty);
		
		
		}
		
			
		}
			
		
		
		
	
		
	
		
		
		
		
		
		
		
			
			
		
				
		
		
		
		
		
	


