package program.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class LearnArrayList1 {
	public static void main(String[] args) {
		
		System.out.print("\n");
		System.out.println("[1] Explanation (ArrayList)");
		System.out.println(">> String을 Element로 갖는 ArrayList 생성.");
		System.out.println(">> ArrayList<String> myArrayList = new ArrayList<String>();");
		System.out.println(">> Element 추가 : {내가 만든 ArrayList}.add()");
		System.out.println(">> Element 삭제 : {내가 만든 ArrayList}.remove()");
		System.out.println(">> 특정 index에 위치한 element 가져오기 : {내가 만든 ArrayList}.get()");
		System.out.print("\n");
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Hello"); myArrayList.add("JAVA"); myArrayList.add("World"); myArrayList.add("!!!");
		for (int i=0; i < myArrayList.size(); i++) { System.out.print(myArrayList.get(i) + " "); }
		System.out.print("\n\n");
		
		myArrayList.add(1, "My");
		for (int i=0; i < myArrayList.size(); i++) { System.out.print(myArrayList.get(i) + " "); }
		System.out.print("\n\n");
		
		myArrayList.remove("Hello");  
		for (int i=0; i < myArrayList.size(); i++) { System.out.print(myArrayList.get(i) + " "); }
		System.out.print("\n\n");
		  
		for (int i=0; i < myArrayList.size(); i++) { System.out.print("(" + i + ") " + myArrayList.get(i) + " "); }
		System.out.print("\n\n");
		
		System.out.println("[2] Explanation (Iterator)");
		System.out.println(">> ArrayList를 탐색하기 위한 방법으로 iterator을 제공합니다.");
		System.out.println(">> 주로 객체지향 프로그래밍에서 사용하는 반복기법 입니다.");
		System.out.print("\n");
		
		Iterator<String> myIterator1 = myArrayList.iterator();
		while(myIterator1.hasNext()) { System.out.print(myIterator1.next() + " "); }
		System.out.print("\n\n");
		
		System.out.println("[3] Explanation (ListIterator)");
		System.out.println(">> myIterator2.next() -> myIterator2.hasNext() -> 가지고 있는 Element 순서대로 출력.");
		System.out.println(">> myIterator2.hasPrevious() -> myIterator2.previous() -> 가지고 있는 Element 역순으로 출력.");
		System.out.print("\n");
		
		ListIterator<String> myIterator2 = myArrayList.listIterator();
		while(myIterator2.hasNext()){ System.out.print(myIterator2.next() + " "); }; 
		System.out.print("\n\n");
		while(myIterator2.hasPrevious()){ System.out.print(myIterator2.previous() + " "); }; 
		System.out.print("\n");

	}
}
