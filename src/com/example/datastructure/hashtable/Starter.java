package com.example.datastructure.hashtable;

public class Starter {

	public static void main(String[] args) {
		HashTable myHash = new HashTable();
		myHash.put("ab", new Employee("Naveen","Kulkarni") );	
		myHash.put("AB", new Employee("Kulkarni","Naveen"));
		myHash.put("xy", new Employee("Kulkarni","Naveen"));
		myHash.put("XY", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));
		myHash.put("ab", new Employee("Kulkarni","Naveen"));

		System.out.println(myHash.get("AB"));
		System.out.println(myHash.get("xy"));
		System.out.println(myHash.get("XY"));
		System.out.println(myHash.get(""));
		
		System.out.println("-------------------------------");
		myHash.printTable();
		System.out.println("-------------------------------");
	}
}
