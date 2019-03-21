package wallmania;

import java.util.HashMap;

public class LearnCollectionsMap {
	
	public static void main(String args[]) {
		
		System.out.println("------------------------------------설명.--------------------------------------");
  		System.out.println(">> key를 이용한다.");
  		System.out.println(">> key는 중복될 수 없다.");
  		System.out.println(">> 데이터는 중복이 가능하다.");
  		System.out.println("------------------------------------------------------------------------------"  + "\n");
		
		System.out.println("// HashMap 객체 생성.");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(">> map.size() : " + map.size());
		System.out.println("");
		
		System.out.println("// 데이터 추가 1.");
		map.put(5, "Hello"); map.put(6, "Java"); map.put(7, "World");
		System.out.println(">> map : " + map);
		System.out.println(">> map.size() : " + map.size());
		System.out.println("");
		
		System.out.println("// 데이터 추가 2.");
		map.put(8, "!!!");
		System.out.println(">> map : " + map);
		System.out.println(">> map.size() : " + map.size());
		System.out.println("");
		
		System.out.println("// 데이터 교체.");
		map.put(6, "C");
		System.out.println(">> map : " + map);
		System.out.println("");
		
		System.out.println("// 데이터 추출.");
		String str = map.get(5);
		System.out.println(">> map.get(5) : " + str);
		System.out.println("");
		
		System.out.println("// 데이터 제거.");
		map.remove(8);
		System.out.println(">> map.remove(8) : " + map);
		System.out.println("");
		
		System.out.println("// 특정 데이터 포함 유무 확인하기.");
		boolean b = map.containsKey(7);
		System.out.println(">> map.containsKey(7) : " + b);
		b = map.containsValue("World");
		System.out.println(">> map.containsValue(\"World\") : " + b);
		System.out.println("");
		
		System.out.println("// 데이터 전체 제거.");
		map.clear();
		System.out.println(">> map : " + map);
		System.out.println("");
		
		System.out.println("// 데이터 유무.");
		b = map.isEmpty();
		System.out.println(">> map.Empty() : " + b);
		System.out.println("");
	}
}
