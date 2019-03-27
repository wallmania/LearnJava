package program.ds;

public class LinkedListMain {
	public static void main(String[] args) {
		
		System.out.println("\n$ [1] .addFirst(), .addLast(), .add()");
		MyLinkedList numbers1 = new MyLinkedList(); numbers1.addFirst(40); numbers1.addFirst(30); numbers1.addFirst(20); numbers1.addFirst(10);
		System.out.println(">> MyLinkedList type 객체 생성 및 .addFirst() 한 결과 : " + numbers1);  numbers1 = null;
		numbers1 = new MyLinkedList(); numbers1.addLast(10); numbers1.addLast(20); numbers1.addLast(30); numbers1.addLast(40);
		System.out.println(">> MyLinkedList type 객체 생성 및 .addLast() 한 결과 : " + numbers1); numbers1 = null; 
		numbers1 = new MyLinkedList(); numbers1.add(0, 10); numbers1.add(1, 20); numbers1.add(2, 30); numbers1.add(3, 40); 
		System.out.println(">> MyLinkedList type 객체 생성 및 .add() 한 결과 : " + numbers1); 
		
		
		System.out.println("\n$ [2] .removeFirst(), .removeLast(), .remove()");
		numbers1.removeFirst();  System.out.println(">> numbers1.removeFirst(); --> " + numbers1);
		numbers1.removeLast();  System.out.println(">> numbers1.removeLast(); --> " + numbers1);
		System.out.println(">> numbers1.remove(1); --> deleted value = " + numbers1.remove(1) + " and numbers1 = " + numbers1); 
		

		System.out.println("\n$ [3] .size(), .indexOf(), .hasNext()");
		System.out.println(">> numbers1 is " + numbers1); 
		for (int i=0; i<numbers1.size(); i++) { System.out.print(">> " + numbers1.indexOf(numbers1.get(i)) + "th element is " + numbers1.get(i) + "\n"); }
		MyLinkedList.ListIterator i = numbers1.listIterator();
		System.out.print(">> if i.hasNext() == true, i.next = ");
		while(i.hasNext()) { System.out.print(i.next() + " "); }
	}
}
