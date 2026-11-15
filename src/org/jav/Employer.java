package org.jav;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employer {
	
	public static void main(String[] args) {
		
	

      Map<Integer, String> mp = new LinkedHashMap();
      
      mp.put(10, "java");
      mp.put(20, "selenium");
      mp.put(30, "python");
      mp.put(40, "css");        
      mp.put(20, "appium");
      mp.put(null, "api");
      
      System.out.println(mp);
      
      int size = mp.size();
      System.out.println(size);
      
      boolean containsKey = mp.containsKey(20);
      System.out.println(containsKey);
      
      boolean containsValue = mp.containsValue("java");
      System.out.println(containsValue);

      mp.remove(null);
      System.out.println(mp);
      
      String string = mp.get(40);
      System.out.println(string);
      
      Set<Integer> keySet = mp.keySet();
      System.out.println(keySet);
      
      Collection<String> values = mp.values();
      System.out.println(values);
      
      Set<Entry<Integer, String>> entrySet = mp.entrySet();
      System.out.println(entrySet);
      
    for (Entry<Integer, String> entry : entrySet) {
    	Integer key = entry.getKey();
		System.out.println(key);
		
		String value = entry.getValue();
	    System.out.println(value);
	    
	    System.out.println(entry);
	    
	    
    
    
    
    }
	
      
      
      
      
      
      
	}
      


	}
















