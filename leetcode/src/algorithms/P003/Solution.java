package algorithms.P003;

public class Solution {

	public int lengthOfLongestSubstring(String s) {

		String substring = "";
		int max = 0;
		for (int i = 0; i < s.length(); i++) {

			String c = s.substring(i, i + 1);
			int index = substring.indexOf(c);

			if (index >= 0) {
				max = Math.max(max, substring.length());
				substring = substring.substring(index + 1, substring.length());
			}
			substring = substring.concat(c);
		}

		max = Math.max(max, substring.length());

		return max;
	}
}
