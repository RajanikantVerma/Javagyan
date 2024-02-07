package com.javagyan.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class SplitByComma {
	
	public static void main(String[] args) {
		String s = "ab,test,try,ab,try,you,chamgadah,motki,motki,ab,test,test,boy,chamgadah";
		StringTokenizer sb = new StringTokenizer(s,",");
		String sorted = "";
		String prev = "";
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		int count = 1;
		while(sb.hasMoreElements()) {
			String ss = sb.nextToken();
			if(prev=="") {
				prev = ss;
			}else if(ss.equals(prev)){
				count++;
			}else {
				sorted = sorted + prev + count;
				count =1;
				prev = ss;
			}
			if(!map.containsKey(ss)) {
				map.put(ss, 1);
			}else {
				map.put(ss, map.get(ss)+1);
			}
		}
		sorted = sorted + prev + count;
		System.out.println(sorted);
		String mapS = "";
		for(Entry<String, Integer> m : map.entrySet()) {
			mapS = mapS+m.getKey()+m.getValue();
		}
		System.out.println(mapS);
	}

}
