package datastr;

public class MyArrayList {
	private int[] list;
	private final int LIST_DEFAULT_SIZE = 10;
	private int size = LIST_DEFAULT_SIZE;
	private int counter = 0;
	
	//Constructors
	public MyArrayList () {
		list = new int[size];
	}
	
	public MyArrayList(int inputSize) {
		if (inputSize > 0) {
			size = inputSize;
		}
		list = new int[size];
	}
	
	//Check if list is empty
	public boolean isEmpty() {
		//return (counter == 0) ? true : false;
		return counter == 0;
	}
	
	//Check if list is full
	public boolean isFull() {
		return counter == size;
	}
	
	//Check list element count
	public int howManyElements() {
		return counter;
	}
	
	//Increase list size
	private void resize() {
		int newSize = (counter <= 100) ? size * 2 : (int)(size * 1.5);
		int[] newList = new int[newSize];
		
		for(int i = 0; i < size; i++) {
			newList[i] = list[i];
		}
		
		list = newList;
		System.gc();
	}
}
