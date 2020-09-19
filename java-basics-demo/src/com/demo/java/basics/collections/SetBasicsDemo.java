package com.demo.java.basics.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Chandan K Soud
 *
 */
public class SetBasicsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This class is used for demonstrating basic Set features");
		basicSetOperations();
		basicBulkSetOperations();
	}

	/**
	 * This method demonstrates the basic operations in Set
	 * 
	 */
	public static void basicSetOperations() {

		System.out.println("\n\nThis method demonstrates the basic operations in Set\n");

		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(3);
		s1.add(4);
		s1.add(2);

		System.out.println("set1: " + s1);
		System.out.println("size of set1: " + s1.size());

		System.out.println("Adding a new element to set1: " + s1.add(10));
		System.out.println("Adding an existing element to set1: " + s1.add(4));

		System.out.println("Removing an existing element from set1: " + s1.remove(2));
		System.out.println("Removing a non-existing element from set1: " + s1.remove(5));

		System.out.println("Altered set1: " + s1);

		System.out.println("set1 now contains 10: " + s1.contains(10));
		System.out.println("set1 now doesn't contain 2: " + !s1.contains(2));

		System.out.println("set1 is empty: " + s1.isEmpty());

	}

	/**
	 * This method demonstrates the basic bulk operations in Set
	 * 
	 */
	public static void basicBulkSetOperations() {

		System.out.println("\n\nThis method demonstrates the basic bulk operations in Set\n");

		// Create int arrays
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 3, 4, 5, 6 };

		// Print the int arrays directly
		System.out.println("a1: " + a1);
		System.out.println("a2: " + a2);

		// Print the int arrays properly
		System.out.println("a1-proper: " + Arrays.toString(a1));
		System.out.println("a2-proper: " + Arrays.toString(a2));

		// Create Integer Sets from int arrays
		Set<Integer> s1 = Arrays.stream(a1).boxed().collect(Collectors.toSet());
		Set<Integer> s2 = Arrays.stream(a2).boxed().collect(Collectors.toSet());

		// Print the Integer Sets
		System.out.println("set1: " + s1);
		System.out.println("set2: " + s2);

		// Create a set with all elements from two sets
		Set<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		System.out.println("union: " + union);

		// Create a set with common elements from two sets
		Set<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
		System.out.println("intersection: " + intersection);

		// Check if set1 is a subset of union
		System.out.println("set1 is a subset of union : " + union.containsAll(s1));
		System.out.println("set1 is a superset of intersection : " + s1.containsAll(intersection));
		System.out.println("set2 is a subset of set1 : " + s1.containsAll(s2));

		// Create a set with elements present only in one of two sets
		Set<Integer> setAsymmetricDiff1 = new HashSet<>(s1);
		setAsymmetricDiff1.removeAll(s2);
		System.out.println("Set Asymmetric Difference (set1 - set2): " + setAsymmetricDiff1);

		Set<Integer> setAsymmetricDiff2 = new HashSet<>(s2);
		setAsymmetricDiff2.removeAll(s1);
		System.out.println("Set Asymmetric Difference (set2 - set1): " + setAsymmetricDiff2);

		// Create a set with uncommon elements from two sets
		Set<Integer> setSymmetricDiff = new HashSet<>(union);
		setSymmetricDiff.removeAll(intersection);
		System.out.println("Set Symmetric Difference: " + setSymmetricDiff);

	}

}
