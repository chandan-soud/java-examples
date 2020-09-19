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
		System.out.println("This class is used for demonstrating basic set features");
		basicBulkSetOperations();
	}

	public static void basicBulkSetOperations() {

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

		Set<Integer> union = new HashSet<>(s1);
		union.addAll(s2);
		System.out.println("union: " + union);

		Set<Integer> intersection = new HashSet<>(s1);
		intersection.retainAll(s2);
		System.out.println("intersection: " + intersection);

		Set<Integer> setAsymmetricDiff1 = new HashSet<>(s1);
		setAsymmetricDiff1.removeAll(s2);
		System.out.println("Set Asymmetric Difference (set1 - set2): " + setAsymmetricDiff1);

		Set<Integer> setAsymmetricDiff2 = new HashSet<>(s2);
		setAsymmetricDiff2.removeAll(s1);
		System.out.println("Set Asymmetric Difference (set2 - set1): " + setAsymmetricDiff2);

		Set<Integer> setSymmetricDiff = new HashSet<>(union);
		setSymmetricDiff.removeAll(intersection);
		System.out.println("Set Symmetric Difference: " + setSymmetricDiff);

	}

}
