package datastr;

public class MyArrayList {
	private int[] list;
	private final int LIST_DEFAULT_SIZE = 10;
	private int size = LIST_DEFAULT_SIZE;
	private int counter = 0;
	
	//TODO
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
	
	//isEmpty
	public boolean isEmpty() {
		//return (counter == 0) ? true : false;
		return counter == 0;
	}
	
	//isFull
	public boolean isFull() {
		return counter == size;
	}
	
	//howManyElements
	public int howManyElements() {
		return counter;
	}
}
