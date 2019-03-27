package program.ds;

public class ArrayvsLinkedList {
	public static void main(String[] args) {
		
		MyArrayList myarraylist = new MyArrayList();
		MyLinkedList mylinkedlist = new MyLinkedList();
		for(int i=0; i<500000; i++) { myarraylist.addLast(i); }		
		for(int j=0; j<500000; j++) { mylinkedlist.addLast(j); }
		
		long StartT1 = System.currentTimeMillis(); 
		myarraylist.addFirst(1); 
		long EndT1 = System.currentTimeMillis(); 
		long DurationT1 = EndT1 - StartT1;
			
		long StartT2 = System.currentTimeMillis(); 
		mylinkedlist.addFirst(1); 
		long EndT2 = System.currentTimeMillis(); 
		long DurationT2 = EndT2 - StartT2;
		
		System.out.println("\n$ [1] ArrayList vs. LinkedList (.addFirst())");
		System.out.println(">> ArrayList에 Element 추가하려면 그 뒤의 Element를 모두 뒤로 한칸씩 미뤄야 한다. --> 추가하는데 걸리는 시간이 길다.");
		System.out.printf(">> ArrayList의 DurationT1(%f ms)\n", (double)DurationT1);
		System.out.println(">> LinkedList에 Element 추가하려면 연결만 해주면 된다. --> 추가하는데 걸리는 시간이 짧다.");
		System.out.printf(">> LinkedList의 DurationT2(%f ms)\n", (double)DurationT2);
		
		long StartT3 = System.currentTimeMillis(); 
		myarraylist.get(400000); 
		long EndT3 = System.currentTimeMillis(); 
		long DurationT3 = EndT3 - StartT3;
		
		long StartT4 = System.currentTimeMillis(); 
		mylinkedlist.get(400000); 
		long EndT4 = System.currentTimeMillis(); 
		long DurationT4 = EndT4 - StartT4;
		
		System.out.println("\n$ [2] ArrayList vs. LinkedList (.get())");
		System.out.println(">> ArrayList에 Element 찾을때 index를 알고 있다. --> 찾는데 걸리는 시간이 짧다.");
		System.out.printf(">> ArrayList의 DurationT3(%f ms)\n", (double)DurationT3);
		System.out.println(">> LinkedList에 Element 찾을때 처음부터 원하는 index에 있는 Element까지 찾아간다. --> 찾는데 걸리는 시간이 길다.");
		System.out.printf(">> LinkedList의 DurationT4(%f ms)\n", (double)DurationT4);
		
		MyArrayList.ListIterator myarraylist_i = myarraylist.listIterator();
		MyLinkedList.ListIterator mylinkedlist_i = mylinkedlist.listIterator();
		System.out.println("\n$ [3] ArrayList vs. LinkedList (ListIterator의 method : .add())");
		
		while(myarraylist_i.hasNext()) {
			if((int)myarraylist_i.next() == 2) {
				long StartT5 = System.currentTimeMillis();
				myarraylist_i.add(-1);
				long EndT5 = System.currentTimeMillis(); 
				long DurationT5 = EndT5 - StartT5;
				System.out.println(">> ArrayList에 Element 추가하려면 그 뒤의 Element를 모두 뒤로 한칸씩 미뤄야 한다. --> 추가하는데 걸리는 시간이 길다.");
				System.out.printf(">> ArrayList의 DurationT5(%f ms)\n", (double)DurationT5);
			} 
		}
		
		while(mylinkedlist_i.hasNext()) {
			if((int)mylinkedlist_i.next() == 2) {
				long StartT6 = System.currentTimeMillis();
				mylinkedlist_i.add(-1);
				long EndT6 = System.currentTimeMillis(); 
				long DurationT6 = EndT6 - StartT6;
				System.out.println(">> LinkedList에 Element 추가하려면 연결만 해주면 된다. --> 추가하는데 걸리는 시간이 짧다.");
				System.out.printf(">> LinkedList의 DurationT6(%f ms)\n", (double)DurationT6);
			} 
		}
	}
	
}
