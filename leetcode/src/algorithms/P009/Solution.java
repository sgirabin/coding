package algorithms.P009;

public class Solution {
	public boolean isPalindrome(int x) {

		if (x < 0) {
			return false;
		}

		int num = 0;
		int input = x;

		while (input != 0) {
			int div = input / 10;
			int mod = input % 10;
			num = num * 10 + mod;
			input = div;
		}

		return num == x;

	}
}