package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] practicegen;
	public ArrayList() {
		
		practicegen = (T[])new Object[0];
		
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		
		
		return practicegen[loc];
	}
	
	public void add(T val) {
		
		T [] practice = (T[])new Object[practicegen.length+1];
		
		practice[practice.length-1] = val;
		
		for (int i = 0; i < practicegen.length; i++) {
			
			practice[i]=practicegen[i];
			
		}
		
		practicegen=practice;
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
		T [] generics = (T[])new Object[practicegen.length+2];
		
		
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}