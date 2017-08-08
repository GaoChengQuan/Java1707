package com.situ.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class ListDemo {
	
	public static void main(String[] args) {
		List list = new ArrayList();
	}
	
	@Test
	public void test1() {
		Stu stu1 = new Stu("zhangsan", 18);
	    Stu stu2 = new Stu("lisi", 20);
	    Stu stu3 = new Stu("wangwu", 21);
	    Stu[] stuArray = new Stu[3];
	    stuArray[0] = stu1;
	    stuArray[1] = stu2;
	    stuArray[2] = stu3;
	    
	    for (int i = 0; i < stuArray.length; i++) {
			System.out.println(stuArray[i]);
		}
	    
	    List<Stu> list = new ArrayList<Stu>();
	    //ArrayList<Stu> list = new ArrayList<Stu>();
	    list.add(stu1);
	    list.add(stu1);
	    list.add(stu2);
	    list.add(stu3);
	    Stu stu = list.get(0);
	    System.out.println(stu);
	    
	    for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	    
	    System.out.println("--------");
	    for (Stu s : list) {
	    	System.out.println(s);
	    }

	    System.out.println("--------");
	    Iterator<Stu> iterator = list.iterator();
	    while (iterator.hasNext()) {
			Stu st = iterator.next();
			System.out.println(st);
		}
	}
	
	@Test
	public void testSet() {
		Stu stu1 = new Stu("zhangsan", 18);
		Stu stu2 = new Stu("lisi", 20);
		Stu stu3 = new Stu("wangwu", 21);
		// Set里面的元素不能重复
		Set<Stu> set = new HashSet<Stu>();
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu1);

		for (Stu stu : set) {
			System.out.println(stu);
		}
	}
	
	@Test
	public void testMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚合众国");
		String val = map.get("CN");
		System.out.println(val);
		System.out.println("------------");
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key: " + key + ", value: " + val);
		}
	}
	
	@Test
	public void test44() {
		List<Integer> list = new ArrayList<Integer>();
//		list.add(new Stu());
//		list.add(new ArrayList());
		list.add(1);
		
		String str = Integer.toString(34);
		String str1 = "34a";
		//System.out.println(Integer.parseInt(str1));
		String boolStr = "true1";
		
		Integer integer = new Integer(3);
		int value = integer.intValue();
		System.out.println(value);
		
		
		
		
		
		
	}
}
