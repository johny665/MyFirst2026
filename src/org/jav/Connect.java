package org.jav;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Connect {
	
	public static void main(String[] args) {
		
		List li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add("java");
		li.add('c');
		li.add(20);
		
		System.out.println(li);
		
		li.add(4, "selenium");
		System.out.println(li);
		
		int indexOf = li.indexOf(20);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(20);
        System.out.println(lastIndexOf);
        
        li.set(4, "python");
        System.out.println(li);
		
        Object object = li.get(2);
        System.out.println(object);
        
        
        for (int i = 0; i< li.size(); i++) {
        	System.out.println(li.get(i));
        	
        }
        	
        	
        Set s = new LinkedHashSet();
       
        s.add(10);
        s.add(20);
        s.add(30);
        s.add("java");
        s.add('a');
        s.add(20);
        
        System.out.println(s);
        
        int size = s.size();
        System.out.println(size);
        
        s.addAll(li);
        System.out.println(s);
        
        s.remove(30);
        System.out.println(s);
        
        boolean contains = s.contains(30);
        System.out.println(contains);
        
      for (Object s1 : s) {
    	  
    	  System.out.println(s1);
		
	}
        
      
      
      //hashset
      
      Set s2 = new HashSet<>();
      
      s2.add(16);
      s2.add('a');
      s2.add("java");
      s2.add(true);
      s2.add(32);
      
      System.out.println(s2);
      
      
      //tree set
      
      Set<Integer> s1 = new TreeSet<>();
      
      s1.add(16);
      s1.add(22);
      s1.add(12);
      s1.add(10);
      s1.add(32);
      s1.add(24);
      
      System.out.println(s1);
      s1.add(null);
      System.out.println(s1);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        	
		
		
		
		
		
	

	

