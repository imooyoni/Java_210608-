package test;

import java.util.ArrayList;

public class review {
	static ArrayList<String> s=new ArrayList<String>();
	StartingPoint ss=new StartingPoint();
	String test;
	static int i;
	public static String getTest() {
		
		for(i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		return "end";
	
		
	}
	public static void setTest(String test) {
		
		s.add(test);
	}
	
	
	
	
	
	}
	

		
		
