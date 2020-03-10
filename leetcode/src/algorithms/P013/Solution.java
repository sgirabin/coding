package algorithms.P013;

import java.util.*;

public class Solution {

	public char[] romans = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	public Integer[] value = { 1, 5, 10, 50, 100, 500, 1000 };

	Map<Character, Integer> map = new HashMap<>();

	Solution() {
		for (int i = 0; i < value.length; i++) {
			map.put(romans[i], value[i]);
		}
	}

	public int romanToInt(String s) {
		int total = 0;
		int previousDecimalValue = 0;
		for (int i = 0; i < s.length(); i++) {
			int decimalValue = map.get(s.charAt(i));
			if (decimalValue > previousDecimalValue && i > 0) {
				decimalValue = decimalValue - previousDecimalValue;
				total = total + (decimalValue - previousDecimalValue);
			} else {
				total = total + decimalValue;
			}
			previousDecimalValue = decimalValue;
		}

		return total;
	}
}
