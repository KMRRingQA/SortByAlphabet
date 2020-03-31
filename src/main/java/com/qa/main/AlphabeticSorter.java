package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticSorter {
	public static String sorter(String input) {
		String sortedString = "";
		String[] separated = input.split(",");
		List<String> seperatedList = new ArrayList<>();
		for (int i = 0; i < separated.length; i++) {
			seperatedList.add(separated[i]);
		}
		java.util.Collections.sort(seperatedList);
		for (int i = 0; i < separated.length; i++) {
			if (i == separated.length - 1) {
				sortedString = sortedString + seperatedList.get(i);
				break;
			}
			sortedString = sortedString + seperatedList.get(i) + ",";
		}
		System.out.print(sortedString);
		return sortedString;
	}
}
