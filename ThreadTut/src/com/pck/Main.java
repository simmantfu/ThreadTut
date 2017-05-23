package com.pck;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Main {

	static Map<String, Integer> map = new HashMap<>();
	static Map<String, Integer> map2 = new HashMap<>();
	

	static String preparemap(String key) {

		
		
		map.put("/:.@ ", 1);
		map.put("ABC", 2);
		map.put("DEF", 3);
		map.put("GHI", 4);
		map.put("JKL", 5);
		map.put("MNO", 6);
		map.put("PQRS", 7);
		map.put("TUV", 8);
		map.put("WXYZ", 9);

		Set<Map.Entry<String, Integer>> setChck =  map.entrySet(); 
		
		Iterator<Entry<String, Integer>> it = setChck.iterator();
		
		while(it.hasNext()){
			Entry<String, Integer> t = it.next();
			if(t.getKey().contains(key)){
				return t.getValue()+"";
			}
		}
		
		return "pan"+key;
	}

	static String preparemap2(String key) {

		map2.put("A", 1);
		map2.put("B", 2);
		map2.put("C", 3);
		map2.put("D", 4);
		map2.put("E", 5);
		map2.put("F", 6);
		map2.put("G", 7);
		map2.put("H", 8);
		map2.put("I", 9);
		map2.put("J", 10);
		map2.put("K", 11);
		map2.put("L", 12);
		map2.put("M", 13);
		map2.put("N", 14);
		map2.put("O", 15);
		map2.put("P", 16);
		map2.put("Q", 17);
		map2.put("R", 18);
		map2.put("S", 19);
		map2.put("T", 20);
		map2.put("U", 21);
		map2.put("V", 22);
		map2.put("W", 23);
		map2.put("X", 24);
		map2.put("Y", 25);
		map2.put("Z", 26);
		map2.put("/", 27);
		map2.put(":", 28);
		map2.put(".", 29);
		map2.put("@", 30);
		map2.put(" ", 31);
		map2.put("-", 31);
		return map2.get(key)!=null?map2.get(key)+"":"age"+key;
		
	}

	public static String getCountry(String s) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("f3.txt")));
		Map<String, String> map = new HashMap<>();
		String ss = "";
		while ((ss = br.readLine()) != null) {
			ss=ss.replace(" ", "");
			map.put(ss.toCharArray()[ss.toCharArray().length - ss.toCharArray().length] + "", ss);
		}

		// Set<Map.Entry<String, String>> entry = map.entrySet();

		//map.forEach((k,v)->System.out.println("key is :"+k+" value is :"+v));
		
		String finalString = map.get(s);

		return Objects.nonNull(finalString)?finalString:"car"+s;

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String test = "https://stackoverflow.com/questions/3382954/measure-execution-time-for-a-java-method";
		char[] msgarray = test.toCharArray();
		String msg = "";

		long startTime = System.currentTimeMillis();
		for (int i = 0, j = 0; i <= test.toCharArray().length-1; i++,j++) {

			if (j > 2) {
				j = 0;
			}
			
			if(j==0){
			msg = msg + " " + getCountry(new String(msgarray[i] + "").toUpperCase());
		
			}
			if(j==1){
				msg = msg + " " + preparemap2(new String(msgarray[i] + "").toUpperCase());
			}
			
			if(j==2){
				msg = msg + " " + preparemap(new String(msgarray[i] + "").toUpperCase());
			}

		}
		
	      long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;

	     System.out.println("time taken : "+TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS));
	     
	  //    System.out.println(1e+9);
	      
		System.out.println(msg);

	}

}
