package program.ds;

public class LearnArrayList2 {
	public static void main(String[] args) {
		
		System.out.print("\n");
		System.out.println("$ [1] Explanation");
		System.out.println(">> 내가 직접 만든 Class MyArrayList를 통해서 배열 생성하기.");
		System.out.println(">> MyArrayList numbers = new MyArrayList();");
		MyArrayList numbers = new MyArrayList();
		System.out.print("\n");
		
		System.out.println("$ [2] numbers.addLast 사용.");
		System.out.println(">> numbers.addLast(10);");
		numbers.addLast(10); numbers.addLast(20); numbers.addLast(30); numbers.addLast(40); numbers.addLast(60);
		System.out.print(">> "); System.out.println(numbers);
		System.out.print("\n");
		
		System.out.println("$ [3] numbers.add 사용.");
		System.out.println(">> numbers.add(1, 50);");
		numbers.add(1, 50);
		System.out.print(">> "); System.out.println(numbers);
		System.out.print("\n");
		
		System.out.println("$ [4] numbers.addFirst 사용.");
		System.out.println(">> numbers.addFirst(1);");
		numbers.addFirst(1);
		System.out.print(">> "); System.out.println(numbers);
		System.out.print("\n");
		
		System.out.println("$ [5] numbers.get 사용.");
		System.out.println(">> numbers.get(0) = 1;");
		System.out.print(">> "); 
		for (int i=0; i<6; i++) { System.out.print(i + "th element(" + (numbers.get(i)).toString() + "), "); }
		System.out.print("\n\n");
		
		System.out.println("$ [6] numbers.remove, numbers.removeFirst, numbers.removeLast 사용.");
		System.out.print(">> "); System.out.println("제거한 항목은 " + numbers.remove(1) + "이고 남은 항목은 " + numbers);
		System.out.print(">> "); numbers.removeFirst(); System.out.println("numbers.removeFirst() : " + numbers);
		System.out.print(">> "); numbers.removeLast(); System.out.println("numbers.removeLast() : " + numbers);
		System.out.print("\n"); 
		
		System.out.println("$ [7] numbers.sizeof() 사용."); 
		System.out.println(">> numbers[" + numbers.indexOf(20) + "] = 20, " + "numbers[" + numbers.indexOf(30) + "] = 30");
		System.out.println(">> numbers[" + numbers.indexOf(70) + "] = 70 --> numbers라는 array에 70이라는 element는 없음.");
		System.out.print("\n"); 
		
		System.out.println("$ [8] ListIterator 사용.");
		System.out.println(">> numbers.listIterator() : numbers라는 MyArrayList 객체에 listIterator()라는 method를 호출한다.");
		System.out.println(">> 호출해서 나온 객체를 li라는 변수에 담는다.");
		System.out.println(">> 변수 li의 데이터 type은 MyArrayList.ListIterator 이다.");
		
		System.out.print("\n"); 
		MyArrayList.ListIterator li1 = numbers.listIterator();
		System.out.println(">> Size of li1 is " + li1.size());
		while(li1.hasNext()) {
			int number1 = (int)li1.next();
			if(number1 == 30){ li1.add(35); }
		}
		System.out.println(">> When 35 is added numbers is " + numbers);
		System.out.print(">> 역순으로 출력하면 "); while(li1.hasPrevious()) { System.out.print(li1.previous() + " "); }  System.out.print("\n");
		

		System.out.print("\n"); 
		MyArrayList.ListIterator li2 = numbers.listIterator();
		System.out.print(">> Size of li2 is " + li2.size());
		while(li2.hasNext()) {
			int number2 = (int)li2.next();
			if(number2 == 30){ li2.remove(); }
		}
		System.out.println("\n" + ">> When 30 is deleted numbers is " + numbers);
		System.out.print(">> 역순으로 출력하면 "); while(li2.hasPrevious()) { System.out.print(li2.previous() + " "); }  System.out.print("\n");
	}
}
