/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;


import java.util.Map.Entry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Comparator;



public class a {


	public static void main(String[] args) {
		
		try{
			BufferedReader b = new BufferedReader(new FileReader("C://text.txt"));
			
			String [] pole;
			String line;
			
			Map<String, Integer> map = new HashMap<String, Integer>();
                        map = null;
			final List<Entry<String, Integer>> lst = new LinkedList<Entry<String, Integer>>();
			
			while ((line = b.readLine()) != null){
				
				line = line.toLowerCase();
				pole = line.split("[,; .\\-\\\"]+!?");
				
				for (String s : pole){
					if(map.get(s) == null){
						if(s.length() > 0){
							map.put(s, 1);
						}
						else map.put(s, map.get(s) + 1);
						
						}
					}
				}
			
			for (Entry<String, Integer> i : map.entrySet()){
				lst.add(i);
			}
			
			Comparator<Entry<String, Integer>> c = new Comparator<Entry<String, Integer>>(){
				
				

				public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
					return arg0.getValue().compareTo(arg1.getValue());
				}
			};
			
			Collections.sort(lst, c);
			
			for(Entry<String, Integer> i : lst){
				System.out.println(i);
			}
			
			b.close();
		}
		catch(Exception vinimka){
			vinimka.printStackTrace();
		}
	}
}