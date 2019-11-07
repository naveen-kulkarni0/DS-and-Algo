package com.example.datastructure.hashtable;

public class HashTable {

	private EmployeeNode table[];

	public HashTable(int size) {
		table = new EmployeeNode[size];
	}

	/*
	 * The more the size of the HashTable lesser are the chances of collision
	 * If we choose 10 as the size the computeIndexByHash() would give same index
	 * if two keys are of same length. Hence it is better to have 16 as the default value
	 */
	public HashTable() {
		table = new EmployeeNode[16];
	}

	private int computeIndexByHash(String key) {
		return key.hashCode() & (table.length - 1);
	}

	private boolean isOccupied(int index) {
		return table[index] != null;
	}

	/* Whenever the index is generated from hashCode, the can be collision (meaning multiple keys can give same index)
	 * the frequency of this depends on the load factor.
	 * There are 3 ways to avoid the collision viz Chaining (What is used in HashMap impl of JDK), linear probing and
	 * multiple hashing.
	 * The implementation below is of linear probing, whenever there is a collision we just increment the index until we find
	 * the first free slot. When retrieving we make use of the key to to return the value.
	 */
	public void put(String key, Employee e) {
		int index = computeIndexByHash(key);
		int currentIndex = -1;
		if(isOccupied(index) && !table[index].key.equals(key)) {
			currentIndex = index++;
			while(index!=currentIndex && isOccupied(index)) {
				index = (index + 1) % table.length;
			}
		}
		if(index == currentIndex) {
			System.out.println("There is no more space to add");
			return;
		}
		table[index] =  new EmployeeNode(key,e);
	}

	/**
	 * Getting the details back from the HashTable
	 * @param key - Required to obtain the details
	 * @return Employee - Details of the requested employee represented by the Key or null 
	 */
	public Employee get(String key) {
		int index = findKey(key);
		if(index == -1) {
			return null;
		}
		return table[index].e;
	}

	private int findKey(String key) {
		int index = computeIndexByHash(key);
		if(table[index] != null && table[index].key.equals(key)) {
			return index;
		}
		int currentIndex = index;
		if(++index == table.length) {
			index=0;
		}
		while(index != currentIndex && table[index] != null && !table[index].key.equals(key)) {
			index = (index + 1) % table.length;
		}
		if(null != table[index] 
				&& table[index].key.equals(key)) {				
			return index;
		}
		return -1;
	}

	public boolean remove(String key) {
		int index = findKey(key);
		if(index == -1) {
			System.out.println("There is no element with the given key");
			return false;
		}
		table[index] = null;
		return true;
	}

	public void printTable() {
		for(int i = 0; i < table.length; i++) {
			if(null != table[i]) {
				System.out.println(table[i].e);
			}
		}
	}
}
