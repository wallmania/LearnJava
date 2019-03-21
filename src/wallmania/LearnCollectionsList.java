package wallmania;

import java.util.ArrayList;

public class LearnCollectionsList {
	
	public static void main(String args[]) {
		
		System.out.println("------------------------------------설명.--------------------------------------");
  		System.out.println(">> 인덱스를 이용한다.");
  		System.out.println(">> 데이터 중복이 가능하다.");
  		System.out.println("------------------------------------------------------------------------------"  + "\n");
		
		System.out.println("// ArrayList 객체 생성.");
		ArrayList<String> list = new ArrayList<String>();
		System.out.println(">> list.size() : " + list.size());
		System.out.println("");
		
		System.out.println("// 데이터 추가 1.");
		list.add("Hello"); list.add("Java"); list.add("World");
		System.out.println(">> list.size() : " + list.size());
		System.out.println(">> list : " + list);
		System.out.println("");
		
		System.out.println("// 데이터 추가 2.");
		list.add(2, "Programming");
		System.out.println(">> list.add(2, \"Programming\") 사용하면 3번째에 Programming 들어가고 나머지는 뒤로 한칸씩 밀린다.");
		System.out.println(">> list : " + list);
		System.out.println("");
		
		System.out.println("// 데이터 추가 3.");
		list.set(1, "C");
		System.out.println(">> list.set(1, \"C\") 사용하면 2번째 항목이 Java -> C로 바뀐다.");
		System.out.println(">> list : " + list);
		System.out.println("");
		
		System.out.println("// 데이터 추출.");
		String str = list.get(2);
		System.out.println(">> list.get(2) : " + str);
		System.out.println(">> list : " + list);
		System.out.println("");
		
		System.out.println("// 데이터 제거.");
		str = list.remove(2);
		System.out.println(">> list.remove(2) : " + str);
		System.out.println(">> list : " + list);
		System.out.println("");
		
		System.out.println("// 데이터 전체 제거.");
		list.clear();
		System.out.println(">> list : " + list);
		System.out.println("");
		
		System.out.println("// 데이터 유무.");
		boolean b = list.isEmpty();
		System.out.println(">> list.Empty() : " + b);
		System.out.println("");
	}

}
