package program.ds;

public class LearnLinkedList1 {
	public static void main(String[] args) {
		
		MyLinkedList numbers1 = new MyLinkedList();
		numbers1.addFirst(30);
		numbers1.addFirst(20);
		numbers1.addFirst(10);
		numbers1.add(2, 25); System.out.println(">> " + numbers1);
		numbers1.removeFirst(); System.out.println(">> " + numbers1);
		System.out.println(">> After removing " + numbers1.remove(2) + " --> " + numbers1 + " and size is " + numbers1.size());
		for (int i=0; i<numbers1.size(); i++) {
			System.out.print(">> " + numbers1.get(i) + "은 " + numbers1.indexOf(numbers1.get(i)) +"번째 element" + "\n");
		}
		MyLinkedList.ListIterator i = numbers1.listIterator();
		System.out.print(">> i.hasNext() 값이 true인 경우에 LinkedList Element 조사하면 --> ");
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		
		
		System.out.print("\n\n");
		
		
		MyLinkedList numbers2 = new MyLinkedList();
		numbers2.addLast(10);
		numbers2.addLast(20);
		numbers2.addLast(30);
		numbers2.add(2, 25); System.out.println(">> " + numbers2);
		numbers2.removeFirst(); System.out.println(">> " + numbers2);
		System.out.println(">> After removing " + numbers2.remove(2) + " --> " + numbers2 + " and size is " + numbers2.size());
		for (int j=0; j<numbers2.size(); j++) {
			System.out.print(">> " + numbers2.get(j) + "은 " + numbers2.indexOf(numbers2.get(j)) +"번째 element" + "\n");
		}
		MyLinkedList.ListIterator j = numbers2.listIterator();
		System.out.println(">> " + numbers2);
		j.add(5); System.out.println(">> " + numbers2);
		j.add(15); System.out.println(">> " + numbers2);
		while(j.hasNext()) {
			if((int)j.next() == 20) {
				j.remove();
			}
		}
		System.out.println(">> "+  numbers2);
		
		
	}
	

}
