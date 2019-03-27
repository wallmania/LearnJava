package program.ds;

public class MyDoubleLinkedList {
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node {
		// Node는 Data를 저장하고 있어야 한다. 
		private Object data;
		// Node는 다음 Node가 누군지에 대한 정보를 담고 있어야 한다. 
		private Node next;
		private Node prev;
		// Constructor(생성자) 생성.
		public Node(Object input) { this.data = input; this.next = null; this.prev = null; }
		// System.out.println(Node) 혹은 System.out.println(Node.toString()) 하면 실행되는 내용.
		public String toString() { return String.valueOf(this.data); }
	}
	
	public void addFirst(Object input) {
		// input 값을 add 하기로 했으므로 Node 객체 하나 생성해야 한다.
		Node newNode = new Node(input);
		// 새로 생성된 Node 객체는 기존 처음 Node (head) 를 가리키고 있어야 한다. 
		newNode.next = head; 
		
		if(head != null) { head.prev = newNode; }
		
		head = newNode;
		// 데이터 추가됬으므로 크기 1 증가한다.
		size++;
		// tail 정의 
		if (head.next == null) { tail = head; }
	}
	
	public void addLast(Object input) {
		// input 값을 add 하기로 했으므로 Node 객체 하나 생성해야 한다.
		Node newNode = new Node(input);
		// Node 객체 size = 0 이면 addFirst와 같은 의미이다.
		if(size==0) {
			addFirst(input);
		} else { 
			// 기존 tail은 새로 생성된 Node 객체를 가리키고 있어야 한디. & 이제 tail은 새로 생성된 Node 객체여야 한다.
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode; 
			// 데이터 추가됬으므로 크기 1 증가한다.
			size++;
		}
	}
	
	public Node node(int index) {
		if(index < size/2) {
			Node x = head;
			for(int i=0; i<index; i++) {
				x = x.next;
			}
			return x;
		} else {
			Node x = tail;
			for(int i=size-1; i>index; i--) {
				x = x.prev;
			}
			return x;
		}
	}
	
	public void add (int k, Object input) {
		if(k==0) {
			addFirst(input);
		} else {
			Node temp1 = node(k-1); 
			Node temp2 = temp1.next;
			// input 값을 add 하기로 했으므로 새로운 Node 객체 생성한다.
			Node newNode = new Node(input);
			// 이전 Node는 새로 생성된 Node를 가리켜야 한다. & 새로 생성된 Node는 이후 Node를 가리켜야 한다. 
			temp1.next = newNode; 
			newNode.next = temp2;
			if(temp2 != null) {
				temp2.prev = newNode;
			}
			newNode.prev = temp1;
			// 데이터 추가됬으므로 크기 1 증가한다.
			size++;
			// tail 정의 
			if(newNode.next == null) { tail = newNode; }
		}
	}
	
	public String toString() {
		if (head==null) { return "[]"; } 
		Node temp = head;
		String str = "["; while (temp.next != null) { str += temp.data + ", "; temp = temp.next; } str += (temp.data + "]");
		return str;
	}
	
	public Object removeFirst() {
		// 첫번째 Node를 지우기로 했으므로 첫번째의 다음 Node가 첫번째 Node 이다.
		Node temp = head; head = head.next;
		// 기존 첫번째 Node는 지운다. & Node 하나 지웠으니 크기가 1만큼 줄어든다.
		Object returnData = temp.data; 
		temp = null;
		if(head != null) {
			head.prev = null;
		}
		size--;
		return returnData;
	}
	
	public Object remove(int k) {
		if (k==0) { return removeFirst(); }

		Node temp = node(k-1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		if(temp.next != null) {
			temp.next.prev = temp;
		}
		Object returnData = todoDeleted.data;
		if (todoDeleted == tail) { 
			tail = temp; 
		}
		
		todoDeleted = null; size--;
		return returnData;
	}
	
	public Object removeLast() {
		// remove해서 마지막 node 삭제한다면? head.next.next .... --> tail 찾은 후 tail 삭제.
		// ArrayList (마지막 위치를 찾을 수 있는) vs. LinkedList (처음부터 .next해서 tail을 찾는) 의 TradeOff
		return remove(size-1); 
	}
	
	public int size() { return size; }
	
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) { return -1; }
		}
		return index;
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	public class ListIterator {
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		ListIterator() {
			next = head;
		}
		
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		
		public Object previous() {
			if (next == null) {
				lastReturned = next = tail;
			} else {
				lastReturned = next = next.prev;
			}
			nextIndex--;
			return lastReturned.data;
		}
		
		
		public void add(Object input) {
			Node newNode = new Node(input);
			
			if(lastReturned == null) {
				head = newNode;
				newNode.next = next;
			} else {
				lastReturned.next = newNode;
				newNode.prev = lastReturned;
				if (next != null) {
					newNode.next = next;
					next.prev = newNode;
				} else {
					tail = newNode;
				}
				newNode.next = next;
			}
			
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		
		public void remove() {
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			Node n = lastReturned.next;
			Node p = lastReturned.prev;
			
			if (p==null) {
				head = n;
				head.prev = null;
				lastReturned = null;
			} else {
				p.next = next;
				lastReturned.prev = null;
			}
			
			if (n==null) {
				tail = p;
				tail.next = null;
			} else {
				n.prev = p;
			}
			
			if (next==null) {
				lastReturned = null;
			} else {
				lastReturned = next.prev;
			}
	
			size--;
			nextIndex--;
		}
	}

}
