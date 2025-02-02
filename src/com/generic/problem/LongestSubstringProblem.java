package com.generic.problem;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int output = getLongestSubstring(input.nextLine());
		System.out.println(output);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static int getLongestSubstring(String string) {
		if (string.isEmpty()) {
			return 0;
		}
		if (string.equals(" ")) {
			return 1;
		}
		HashSet returnSet = new HashSet<>(5);
		int size = 0,sizeCounter = 0;
		for (int i = 0; i < string.length(); i++) {
			if (returnSet.add(string.charAt(i))) {
				if (size < returnSet.size()) {
					size = returnSet.size();
				}
			} else {
				returnSet.remove(string.charAt(sizeCounter));
				i--; sizeCounter++;
			}
		}
		if (size < returnSet.size()) {
			size = returnSet.size();
		}
		return size;
	}
}
