package program.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class LearnArrayList1 {
	public static void main(String[] args) {
		
		System.out.print("\n");
		System.out.println("$ [1] Explanation (ArrayList)");
		System.out.println(">> ArrayList<String> myArrayList = new ArrayList<String>(); --> String을 Element로 갖는 ArrayList 생성.");
		System.out.print("\n");
		
		System.out.println("$ [2] Element 추가 : .add(원하는 String)");
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Hello"); myArrayList.add("JAVA"); myArrayList.add("World"); myArrayList.add("!!!");
		System.out.print(">> ");
		for (int i=0; i < myArrayList.size(); i++) { System.out.print(myArrayList.get(i) + " "); }
		System.out.print("\n\n");
		
		System.out.println("$ [3] Element 추가 : .add(원하는 index, 원하는 String)");
		myArrayList.add(1, "My");
		System.out.print(">> ");
		for (int i=0; i < myArrayList.size(); i++) { System.out.print(myArrayList.get(i) + " "); }
		System.out.print("\n\n");
		
		System.out.println("$ [4] Element 가져오기 : .get(원하는 index)");
		myArrayList.remove("Hello");  
		System.out.print(">> ");
		for (int i=0; i < myArrayList.size(); i++) { System.out.print("(" + i + ") " + myArrayList.get(i) + " "); }
		System.out.print("\n\n");
		
		System.out.println("$ [2] Explanation (Iterator)");
		System.out.println(">> ArrayList를 탐색하기 위한 방법으로 iterator을 제공 & 주로 객체지향 프로그래밍에서 사용하는 반복기법");
		System.out.print(">> ");
		Iterator<String> myIterator1 = myArrayList.iterator();
		while(myIterator1.hasNext()) { System.out.print(myIterator1.next() + " "); }
		System.out.print("\n\n");
		
		System.out.println("$ [3] Explanation (ListIterator)");
		System.out.println(">> myIterator2.hasNext() 값이 true 일때 myIterator2.next() -> 가지고 있는 Element 순서대로 출력.");
		System.out.println(">> myIterator2.previous() 값이 true 일때 myIterator2.hasPrevious() -> 가지고 있는 Element 역순으로 출력.");
		ListIterator<String> myIterator2 = myArrayList.listIterator();
		System.out.print(">> ");
		while(myIterator2.hasNext()){ System.out.print(myIterator2.next() + " "); }; 
		System.out.print("\n>> ");
		while(myIterator2.hasPrevious()){ System.out.print(myIterator2.previous() + " "); }; 
		System.out.print("\n");
	}
}
