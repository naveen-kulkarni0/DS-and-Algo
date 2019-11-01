package com.example.datastructure.hashtable;

public class HashTable {

	private String table[];

	public HashTable(int size) {
		table = new String[size];
	}

	/*
	 * The more the size of the HashTable lesser are the chances of collision
	 * If we choose 10 as the size the computeIndexByHash() would give same index
	 * if two keys are of same length. Hence it is better to have 16 as the default value
	 */
	public HashTable() {
		table = new String[16];
	}

	private int computeIndexByHash(String key) {
		System.out.println(key.hashCode());
		return key.hashCode() & (table.length - 1);
	}

	public void put(String key, String value) {
		int index = computeIndexByHash(key);
		table[index] =  value;
	}

	public String get(String key) {
		int index = computeIndexByHash(key);
		return table[index];
	}
}
