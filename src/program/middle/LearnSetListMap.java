package program.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LearnSetListMap {
	
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("$ [0] Set, List, Map은 모두 Generic을 사용한다.");
		System.out.println("");
		
		System.out.println("$ [1] Set");
		System.out.println(">> Set<String> set1 = new HashSet<>();"); 
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang"); boolean flag2 = set1.add("kim"); boolean flag3 = set1.add("kang");
		
		System.out.println(">> boolean flag1 = set1.add(\"kang\"); --> flag1 값은 " + flag1);
		System.out.println(">> boolean flag2 = set1.add(\"kim\"); --> flag2 값은 " + flag2);
		System.out.println(">> boolean flag3 = set1.add(\"kang\"); --> flag3 값은 " + flag3);
		System.out.printf(">> Set에서는 값이 중복될 수 없다 --> 내가 만든 set1의 size는 %d 이다.\n", set1.size());
		System.out.printf(">> Set에서는 값이 중복될 수 없다 --> 내가 만든 set1의 element는 ");
		Iterator<String> iter1 = set1.iterator();
		while(iter1.hasNext()) {
			String str = iter1.next();
			System.out.print(str + " ");	
		}
		
		System.out.print("\n\n");
		System.out.println("$ [2] List");
		System.out.println(">> List<String> list = new ArrayList<>();");
		System.out.println(">> list.add(\"kim\"); list.add(\"kang\"); list.add(\"kim\");");
		List<String> list = new ArrayList<>();
		list.add("kim"); list.add("kang"); list.add("kim");
		
		System.out.printf(">> List에서는 값이 중복될 수 없다 --> 내가 만든 list의 size는 %d 이다.\n", list.size());
		System.out.printf(">> List에서는 값이 중복될 수 없다 --> 내가 만든 list의 element는 ");
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.print(str + " ");
		}
		
		System.out.print("\n\n");
		System.out.println("$ [3] Map");
		System.out.println(">> Map<String, String> map = new HashMap<>();");
		System.out.println(">> map.put(\"1\", \"a1\"); map.put(\"2\", \"b2\"); map.put(\"3\", \"c3\");");
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "a1"); map.put("2", "b2"); map.put("3", "c3");
		System.out.print(">> The size of this map is " + map.size());
		System.out.print(" and elements of this map are ");
		for (int i=1; i<=map.size(); i++) {
			System.out.print(map.get(String.valueOf(i))+ " ");
		}
		
		System.out.print("\n>>\n");
		System.out.println(">> map.put(\"1\", \"1a\"); map.put(\"2\", \"2b\"); map.put(\"3\", \"3c\");");
		map.put("1", "1a"); map.put("2", "2b"); map.put("3", "3c");
		System.out.print(">> The size of this map is " + map.size());
		System.out.print(" and elements of this map are ");
		for (int i=1; i<=map.size(); i++) {
			System.out.print(map.get(String.valueOf(i))+ " ");
		}
		
		System.out.print("\n>>\n");
		System.out.println(">> Map의 모든 Key 값을 가져올 수 있고 해당 Key에 대한 Value 값을 가져올 수 있다.");
		Set<String> keys = map.keySet();
		Iterator<String> iter2 = keys.iterator();
		while(iter2.hasNext()) {
			String key = iter2.next();
			String value = map.get(key);
			System.out.printf(">> Key(%s) and Value(%s)\n", key, value);
		}
		
				
	}

}
