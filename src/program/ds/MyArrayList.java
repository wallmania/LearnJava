package program.ds;

public class MyArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	// addFirst
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	// addLast
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	// add
	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) { elementData[i+1] = elementData[i]; }
		elementData[index] = element;
		size++;
		return true;
	}
	
	// toString
	public String toString() {
		String str = "[";
		for(int i=0; i < size; i++) {
			str += elementData[i];
			if(i < size-1) { str += ", "; }
		}
		return str + "]";
	}
	
	// remove
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i = index+1; i<=size-1; i++) {
			elementData[i-1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return removed;
	}
	
	// removeFirst
	public Object removeFirst() {
		return remove(0);
	}
	
	// removeLast
	public Object removeLast() {
		return remove(size-1);
	}
	
	// get
	public Object get(int index) {
		return elementData[index];
	}
	
	// size
	public int size() {
		return size;
	}
	
	public int indexOf(Object o) {
		for(int i=0; i<size; i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public ListIterator listIterator() {
		System.out.println("*** ListIterator 라는 data tpye의 listIterator() method가 실행되었습니다. ***");
		return new ListIterator();
	}
	
	class ListIterator {
		private int nextIndex = 0;
		
		public int size() {
			return size;
		}
		
		public boolean hasNext() { 
			return nextIndex < size(); 
		}
		
		public Object next() {
			// Object returnData = elementData[nextIndex]; nextIndex++; return returnData;
			return elementData[nextIndex++];
		}
		
		public Object previous() { return elementData[--nextIndex]; }
		
		public boolean hasPrevious() { return nextIndex > 0; }
		
		public void add(Object element) {
			MyArrayList.this.add(nextIndex, element);
		}
		
		public void remove() {
			MyArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}
	
	
}
