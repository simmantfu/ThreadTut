package com.pck;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String... ar) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("f3.txt")));
		Map<String, String> map= new HashMap<>();
		String ss = "";
		while((ss=br.readLine())!=null){
			map.put(ss.toCharArray()[ss.toCharArray().length-ss.toCharArray().length]+"", ss);
		}
		
		//Set<Map.Entry<String, String>> entry = map.entrySet();

		map.forEach((k,v)-> System.out.println("key "+k+""+" value "+v));
		
	}
	
}
